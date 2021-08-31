package dto

import java.time.ZonedDateTime

data class UserDTO(val _id : Int, val name: String, val created_at : ZonedDateTime, val verified : Boolean)
