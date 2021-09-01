package search

import dto.UserDTO
import service.TicketService
import service.UserService

typealias TicketTopics = List<String>
class SearchDataStores(val userService: UserService,val ticketService: TicketService) {

    fun searchUserById(givenUserId: Int): Pair<UserDTO, TicketTopics> {
        val user = userService.findUserById(givenUserId)
        val ticketsTopics = ticketService.searchByAssignee(givenUserId).map { it.subject }
        return Pair(user,ticketsTopics)
    }

}
