package dto

import java.time.ZonedDateTime
import java.util.*

data class TicketDTO (val _id : UUID, val created_at : ZonedDateTime, val type : TicketType?,
                        val subject : String, val assignee_id : Int? , val tags : List<String> )



