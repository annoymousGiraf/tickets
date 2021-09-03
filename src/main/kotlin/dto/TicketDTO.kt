package dto

import entity.User
import java.time.ZonedDateTime
import java.util.*

data class TicketDTO (val _id : UUID, val created_at : ZonedDateTime, val type : TicketType?,
                        val subject : String, val assignee_id : Int? , val tags : List<String> )


val ticketDataTypes = mapOf(
    "_id" to Int,
    "subject" to String,
    "created_at" to ZonedDateTime::class.java,
    "assignee_id" to Int,
    "type" to TicketType::class.java,
    "tags" to String
)


