package entity

import dto.UserDTO

typealias TicketTopics = List<String>

data class User(val user: UserDTO, val ticketTopics: TicketTopics) {

    override fun toString(): String {
        return """
            _id             ${user._id}
            name            ${user.name}
            created_at      ${user.created_at}
            verified        ${user.verified}
            tickets         $ticketTopics
            
        """.trimIndent()
    }
}