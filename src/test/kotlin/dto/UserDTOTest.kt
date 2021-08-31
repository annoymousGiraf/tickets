package dto.test.data.dto

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import dto.UserDTO
import dto.test.data.userJson
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.time.ZoneId
import java.time.ZonedDateTime
import java.time.format.DateTimeFormatter
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserDTOTest {

    private val objectMapper = jacksonObjectMapper()
        .registerModule(JavaTimeModule())
    private val user : UserDTO = objectMapper.readValue(userJson)

    @Nested
    inner class UserShouldBeInACorrectFormat {

        @Test
        fun `user should have id`() {
            val givenId: Int = 1

            assertEquals(givenId, user._id)
        }

        @Test
        fun `user should have created date`() {
            val givenDate = ZonedDateTime
                .parse("2016-04-15T05:19:46-10:00", DateTimeFormatter.ISO_OFFSET_DATE_TIME)
                .withZoneSameInstant(ZoneId.of("UTC"))

            assertEquals(givenDate, user.created_at)
        }

        @Test
        fun `user should have verify alias`() {
            val isVerified = true

            assertEquals(isVerified, user.verified)
        }

    }

}