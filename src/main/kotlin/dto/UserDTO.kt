package dto


import java.time.ZonedDateTime
import java.util.regex.Pattern

data class UserDTO(val _id : Int, val name: String, val created_at : ZonedDateTime, val verified : Boolean)


val userDataTypes = mapOf(
    "_id" to "\\d+".toRegex(),
    "name" to "([\\w\\s]+)".toRegex(),
    "created_at" to "ZonedDateTime::class.java".toRegex(),
    "verified" to "true|false".toRegex()
)


