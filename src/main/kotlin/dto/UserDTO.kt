package dto


import java.time.ZonedDateTime


data class UserDTO(val _id : Int, val name: String, val created_at : ZonedDateTime, val verified : Boolean)

const val dateFormat = "^[1-9][0-9]+-[0-9]+-[0-9]+[A-Z][0-9]+:[0-9]+:[0-9]+[0-9]+-[0-9]+:[0-9]+"

val userDataTypes = mapOf(
    "_id" to "\\d+".toRegex(),
    "name" to "^.+".toRegex(),
    "created_at" to dateFormat.toRegex(),
    "verified" to "true|false".toRegex()
)


