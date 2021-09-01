package dto.test.data.search

import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataEntity.*

import data.store.TicketDataStore
import data.store.UserDataStore
import dto.UserDTO
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.junit.jupiter.api.assertAll
import search.SearchDataStores
import service.TicketService
import service.UserService
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class SearchDataStoresTest {

    val searchDataStores : SearchDataStores

    init {
        val ticketUrlToJson = {}.javaClass.classLoader
            .getResource("tickets.json")
        val jsonTicketDataStore = DataStoreFactory
            .createDataStore(ticketUrlToJson, TICKETS) as TicketDataStore

        val usersUrlToJson = {}.javaClass.classLoader
            .getResource("users.json")
        val jsonUserDataStore : UserDataStore = DataStoreFactory
            .createDataStore(usersUrlToJson, USERS) as UserDataStore

        val userService : UserService = UserService(jsonUserDataStore)
        val ticketService : TicketService = TicketService(jsonTicketDataStore)

        searchDataStores = SearchDataStores(userService,ticketService)
    }


    @Test
    fun `user should be able to search user with all tickets`() {
        //Given
        val givenUserId = 24
        val expectedTopics = listOf("A Catastrophe in Korea (North)", "A Catastrophe in Belize",
            "A Nuisance in Macedonia", "A Nuisance in Tajikistan")
        //When
        val user : Pair<UserDTO,List<String>> = searchDataStores.searchUserById(givenUserId)
        //Then
        assertIterableEquals(expectedTopics, user.second)

    }


}