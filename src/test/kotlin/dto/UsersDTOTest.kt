package dto.test.data.dto

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import dto.UserDTO
import dto.test.data.allUsersJson
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.TestInstance.*
import kotlin.test.assertEquals

@TestInstance(Lifecycle.PER_CLASS)
class UsersDTOTest {


    private val objectMapper = jacksonObjectMapper()
        .registerModule(JavaTimeModule())
    private val users : List<UserDTO>

    init {
        val usersJson : String = allUsersJson
        users = objectMapper.readValue(usersJson)
    }

    @Test
    fun `should be able to load all users`(){

        assertEquals(75,users.size)
    }
}