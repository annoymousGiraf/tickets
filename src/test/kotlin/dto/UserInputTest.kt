package dto.test.data.dto

import app.dto.ticketTypeRegex
import dto.ticketDataTypes
import dto.userDataTypes
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
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

    @Test
    fun `should be able to detect input type of boolean`() {
        //Given
        val givenType ="verified"
        //When
        val expectedType : Regex = userDataTypes[givenType]!!
        val matching = "true".matches(expectedType)
        //Then
        assertEquals(true , matching)
    }

    @Test
    fun `should be able to detect input type of TicketType`() {
        //Given
        val givenType ="type"
        //When
        val expectedType : Regex = ticketDataTypes[givenType]!!
        val matching = "incident".matches(expectedType)
        //Then
        assertEquals(true , matching)
    }

}