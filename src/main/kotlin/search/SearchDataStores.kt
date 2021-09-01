package search


import entity.TicketEntity
import entity.User
import service.TicketService
import service.UserService



class SearchDataStores(private val userService: UserService, private val ticketService: TicketService) {
    private val usersWithTicketTopics : Set<User>
    private val ticketWithUserName : Set<TicketEntity>
    init {
        usersWithTicketTopics = prepareCollectionOfUsersAndTikcets()
        ticketWithUserName = setOf()
    }



    fun searchUserById(givenUserId: Int) : User = usersWithTicketTopics
        .first { it.user._id == givenUserId }



    private fun getUserById(givenUserId: Int): User {
        val user = userService.findUserById(givenUserId)
        val ticketsTopics = ticketService.searchByAssignee(givenUserId).map { it.subject }
        return User(user,ticketsTopics)
    }

    private fun prepareCollectionOfUsersAndTikcets() : Set<User> {
       return userService
            .findAllUsers()
            .asSequence()
            .map { this.getUserById(it._id) }
            .toSet()
    }

}
