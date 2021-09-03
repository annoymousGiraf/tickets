package dto.test.data.dto

import dto.userDataTypes
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.time.ZonedDateTime
import kotlin.test.assertEquals
import kotlin.test.assertTrue

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserInputTest {

    @Test
    fun `should be able to detect input type`() {
        //Given
        val givenType ="name"
        //When
        val expectedType : Regex = userDataTypes[givenType]!!
        //Then
        assertTrue("Francis Rodrigüez".matches(expectedType))
    }
}