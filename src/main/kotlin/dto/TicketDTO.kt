package dto

import app.dto.*
import java.time.ZonedDateTime
import java.util.*

data class TicketDTO (val _id : UUID, val created_at : ZonedDateTime, val type : TicketType?,
                        val subject : String, val assignee_id : Int? , val tags : List<String> )



val ticketDataTypes = mapOf(
    "_id" to uuidRegex.toRegex(),
    "subject" to stringRegex.toRegex(),
    "created_at" to dateFormat.toRegex(),
    "assignee_id" to intRegex.toRegex(),
    "type" to ticketTypeRegex.toRegex(),
    "tags" to stringRegex.toRegex()
)


