package dto.test.data.search

import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataEntity.*

import data.store.TicketDataStore
import data.store.UserDataStore
import dto.TicketType.*
import entity.TicketEntity
import entity.User
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Nested
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import search.SearchDataStores
import service.TicketService
import service.UserService
import java.time.ZonedDateTime
import java.util.*

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SearchDataStoresTest {

    private val searchDataStores : SearchDataStores

    init {
        val jsonTicketDataStore = createTicketDataStore()

        val jsonUserDataStore: UserDataStore = createUserDataStore()

        val userService : UserService = UserService(jsonUserDataStore)
        val ticketService : TicketService = TicketService(jsonTicketDataStore)

        searchDataStores = SearchDataStores(userService,ticketService)
    }

    @Nested
    inner class HappyPathTestCases {


        @Test
        fun `user should be able to search tickets by assignee id`() {
            //Given
            val givenUserId = 24

            //When
            val tickets: List<TicketEntity> = searchDataStores.searchTicketByAssigneeId(givenUserId)
            //Then
            assertEquals(4, tickets.size)
        }

        @Test
        fun `user should be able to search by type`() {
            //Given
            val givenType = TASK

            //When
            val tickets = searchDataStores.searchTicketByType(givenType)
            //Then
            assertEquals(58, tickets.size)
        }

        @Test
        fun `user should be able to search Ticket by UUID`() {
            //Given
            val ticketUUID = UUID.fromString("436bf9b0-1147-4c0a-8439-6f79833bff5b")

            //When
            val ticket = searchDataStores.searchTicketByUUID(ticketUUID)
            //Then
            assertEquals("A Catastrophe in Korea (North)", ticket?.ticketDTO?.subject)
        }

        @Test
        fun `user should be able to search Ticket by Subject`() {
            //Given
            val ticketSubject = "A Catastrophe in Korea (North)"

            //Then
            val ticket = searchDataStores.searchTicketBySubject(ticketSubject)

            //Them
            assertEquals(UUID.fromString("436bf9b0-1147-4c0a-8439-6f79833bff5b"), ticket?.ticketDTO?._id)
        }

        @Test
        fun `user should be able to search ticket by Date`() {
            //Given
            val ticketDate = ZonedDateTime.parse("2016-02-11T15:46:29Z[UTC]")
            //When
            val tickets = searchDataStores.searchTicketByDate(ticketDate)
            //Then
            assertEquals(UUID.fromString("5aa53572-b31c-4d27-814b-11709ab00259"), tickets[0].ticketDTO._id)
        }

        @Test
        fun `user should be able to search ticket by tag`() {
            //Given
            val tag = "Wyoming"
            //When
            val tickets = searchDataStores.searchTicketByTag(tag)
            //Then
            assertEquals(13, tickets.size)
        }

        @Test
        fun `user should be able to search by name`() {
            //Given
            val givenName = "Cross Barlow"

            //When
            val user: List<User> = searchDataStores.searchUserByName(givenName)
            //Then
            assertEquals(1, user.size)
        }

        @Test
        fun `user should be able to search users by created date`() {
            //Given
            val givenTime = ZonedDateTime.parse("2016-06-23T10:31:39-10:00")

            //When
            val users = searchDataStores.searchUsersByCreatedDate(givenTime)
            //Then
            assertEquals(1, users.size)
        }

        @Test
        fun `user should be able to search user with all tickets`() {
            //Given
            val givenUserId = 24
            val expectedTopics = listOf(
                "A Catastrophe in Korea (North)", "A Catastrophe in Belize",
                "A Nuisance in Macedonia", "A Nuisance in Tajikistan"
            )
            //When
            val user = searchDataStores.searchUserById(givenUserId)
            //Then
            assertIterableEquals(expectedTopics, user?.ticketTopics)

        }

        @Test
        fun `user should be able to search all verfied users`() {
            //Given
            val expectedSize = 26
            //When
            val users : List<User> = searchDataStores.searchVerifiedUsers()
            //Then
            assertEquals(expectedSize,users.size)
        }

        @Test
        fun `user should be able to search all unverfied users`() {
            //Given
            val expectedSize = 49
            //When
            val users : List<User> = searchDataStores.searchUnverifiedUsers()
            //Then
            assertEquals(expectedSize,users.size)
        }
    }

    @Nested
    inner class FailedScenarioTests {
        @Test
        fun `user should be able to search Ticket by UUID and result is null`() {
            //Given
            val ticketUUID = UUID.fromString("6aac0369-a7e5-4411-8ba0-92528ef485d3")

            //When
            val ticket = searchDataStores.searchTicketByUUID(ticketUUID)
            //Then
            assertEquals(null, ticket)
        }

        @Test
        fun `user should be able to search Ticket by Subject and result is null`() {
            //Given
            val ticketSubject = "A Catastrophe in Kohgth)"

            //Then
            val ticket = searchDataStores.searchTicketBySubject(ticketSubject)

            //Them
            assertEquals(null, ticket)
        }

        @Test
        fun `user should be able to search user with all tickets and not getting a result`() {
            //Given
            val givenUserId = 232312

            //When
            val user = searchDataStores.searchUserById(givenUserId)
            //Then
            assertEquals(null, user)

        }

    }

    private fun createUserDataStore(): UserDataStore {
        val usersUrlToJson = {}.javaClass.classLoader
            .getResource("users.json")
        return DataStoreFactory
            .createDataStore(usersUrlToJson, USERS) as UserDataStore
    }

    private fun createTicketDataStore(): TicketDataStore {
        val ticketUrlToJson = {}.javaClass.classLoader
            .getResource("tickets.json")
        return DataStoreFactory
            .createDataStore(ticketUrlToJson, TICKETS) as TicketDataStore
    }

}