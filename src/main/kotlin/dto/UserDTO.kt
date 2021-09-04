package dto


import app.dto.booleanRegex
import app.dto.dateFormat
import app.dto.intRegex
import app.dto.stringRegex
import java.time.ZonedDateTime


data class UserDTO(val _id : Int, val name: String, val created_at : ZonedDateTime, val verified : Boolean)


val userDataTypes = mapOf(
    "_id" to intRegex.toRegex(),
    "name" to stringRegex.toRegex(),
    "created_at" to dateFormat.toRegex(),
    "verified" to booleanRegex.toRegex()
)


