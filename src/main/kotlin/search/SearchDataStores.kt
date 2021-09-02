package search

import dto.TicketDTO
import dto.TicketType
import entity.EmptyTicket
import entity.TicketEntity
import entity.User
import service.TicketService
import service.UserService
import java.util.*


class SearchDataStores(private val userService: UserService, private val ticketService: TicketService) {
    private val usersWithTicketTopics : Set<User>
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
            .map { TicketEntity(it,mapUserIdToUserName[it.assignee_id] ?: "") }
            .toSet()
    }

    fun searchUserById(givenUserId: Int) : User = usersWithTicketTopics
        .first { it.user._id == givenUserId }


    fun searchTicketByAssigneeId(userId: Int): List<TicketEntity> = ticketWithUserName
            .filter { it.ticketDTO.assignee_id == userId }
            .toList()

    fun searchTicketByType(ticketType: TicketType): List<TicketEntity> {
        return ticketService.searchTicketByType(ticketType)
            .map { TicketEntity(it,mapUserIdToUserName[it.assignee_id] ?: "") }

    }

    fun searchTicketByUUID(uuid: UUID) : TicketEntity {
        val ticket = ticketService.searchTicketByUuid(uuid)
        if (ticket is TicketDTO) {
            return TicketEntity(ticket,mapUserIdToUserName[ticket.assignee_id] ?: "")
        }
        return EmptyTicket()

    }

    fun searchTicketBySubject(ticketSubject: String): TicketEntity {
        val ticket = ticketService.searchTicketBySubject(ticketSubject)
        if (ticket is TicketDTO) {
            return TicketEntity(ticket, mapUserIdToUserName[ticket.assignee_id] ?: "")
        }
        return EmptyTicket()
    }

    private fun getUserById(givenUserId: Int): User {
        val user = userService.findUserById(givenUserId)
        val ticketsTopics = ticketService.searchByAssignee(givenUserId).map { it.subject }
        return User(user,ticketsTopics)
    }

    private fun prepareCollectionOfUsersAndTickets() : Set<User> {
       return userService
            .findAllUsers()
            .asSequence()
            .map { this.getUserById(it._id) }
            .toSet()
    }




}
