package search

import dto.TicketDTO
import dto.TicketType
import dto.UserDTO
import entity.TicketEntity
import entity.User
import service.TicketService
import service.UserService
import java.time.ZonedDateTime
import java.util.*


class SearchDataStores(private val userService: UserService, private val ticketService: TicketService) {
    private val usersWithTicketTopics : Map<Int,List<String>>
    private val ticketWithUserName : Set<TicketEntity>
    private val mapUserIdToUserName : Map<Int,String>

    init {
        usersWithTicketTopics = prepareCollectionOfUsersAndTickets()
        mapUserIdToUserName = userService
                .findAllUsers()
                .map{ it._id to it.name }
                .toMap()

        ticketWithUserName = ticketService
            .getAllAssignedTickets()
            .map { TicketEntity(it,getUserNameById(it.assignee_id)) }
            .toSet()
    }


    fun searchTicketByAssigneeId(userId: Int): List<TicketEntity> = ticketWithUserName
            .filter { it.ticketDTO.assignee_id == userId }
            .toList()

    fun searchTicketByType(ticketType: TicketType): List<TicketEntity> = ticketService
        .searchTicketByType(ticketType)
        .map { TicketEntity(it, getUserNameById(it.assignee_id)) }




    fun searchTicketByUUID(uuid: UUID) : TicketEntity? {
        val ticket = ticketService.searchTicketByUuid(uuid)
        if (ticket is TicketDTO) {
            return TicketEntity(ticket,getUserNameById(ticket.assignee_id))
        }
        return null
    }



    fun searchTicketBySubject(ticketSubject: String): TicketEntity? {
        val ticket = ticketService.searchTicketBySubject(ticketSubject)
        if (ticket is TicketDTO) {
            return TicketEntity(ticket, getUserNameById(ticket.assignee_id))
        }
        return null
    }

    fun searchTicketByDate(ticketDate: ZonedDateTime): List<TicketEntity> = ticketService
        .searchTicketByTime(ticketDate)
        .map { TicketEntity(it,getUserNameById(it.assignee_id)) }


    fun searchTicketByTag(tag: String): List<TicketEntity> = ticketService
            .searchTicketByTag(tag)
            .map { TicketEntity(it,getUserNameById(it.assignee_id)) }

    fun searchUserById(userId: Int) : User? {
        val user = userService.findUserById(userId)
        return if (user != null) transformToUserEntity(user) else null
    }

    fun searchUserByName(name: String): List<User> = userService
        .findUserByName(name)
        .map (::transformToUserEntity)

    fun searchUsersByCreatedDate(createdTime: ZonedDateTime): List<User> = userService
        .findAllUserByCreatedDate(createdTime)
        .map (::transformToUserEntity)

    fun searchVerifiedUsers(): List<User> = userService
        .findVerifiedUsers()
        .map (::transformToUserEntity)

    fun searchUnverifiedUsers(): List<User> = userService
        .findUnVerfiedUsers()
        .map (::transformToUserEntity)

    fun searchUserByVerification(isVerfied : Boolean) : List<User> {
       return if (isVerfied) searchVerifiedUsers() else searchUnverifiedUsers()
    }

    private fun transformToUserEntity(it: UserDTO) = User(it, usersWithTicketTopics[it._id] ?: listOf())


    private fun prepareCollectionOfUsersAndTickets() : Map<Int,List<String>> {
       return userService
            .findAllUsers()
            .asSequence()
            .map { it._id }
            .map {
                it to ticketService.searchByAssignee(it)
                    .map { ticket -> ticket.subject }
            }
            .toMap()
    }


    private fun getUserNameById(assignee_id : Int?) : String = if (assignee_id != null ) mapUserIdToUserName[assignee_id] ?: ""
            else ""

}
