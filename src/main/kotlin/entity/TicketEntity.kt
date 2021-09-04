package entity

import dto.TicketDTO
import java.time.ZonedDateTime
import java.util.*

data class TicketEntity(val ticketDTO: TicketDTO, val userName : String) {


    override fun toString(): String {
        return """
            _id             ${ticketDTO._id}
            created_at      ${ticketDTO.created_at}
            type            ${ticketDTO.type?.typeName}
            subject         ${ticketDTO.subject}
            assignee_id     ${ticketDTO.assignee_id}
            tags            ${ticketDTO.tags}
            assignee_name   $userName
            
        """.trimIndent()
    }
}