package dto.test.data.service

import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataEntity.*
import data.store.DataStore
import data.store.UserDataStore
import dto.UserDTO
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import service.UserService
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserServiceTest {
    val jsonUserDataStore : DataStore
    val userService : UserService
    init {
        val urlToJson = {}.javaClass.classLoader.getResource("users.json")
        jsonUserDataStore = DataStoreFactory.createDataStore(urlToJson, USERS) as DataStore
        userService = UserService(jsonUserDataStore as UserDataStore)
    }

    @Test
    fun `search user by id should return user with tickets`() {
        //Given
        val givenAssigneeId = 24
        val expectedName = "Harris Côpeland"
        //When
        val user : UserDTO = userService.findUserById(givenAssigneeId)

        //Then
        assertEquals(expectedName ,user.name)
    }

    @Test
    fun `get all users should retrive all users in the datastore`(){
        //Given
        val expectedUsers = 75
        //When
        val users = userService.findAllUsers()
        //Then
        assertEquals(expectedUsers,users.size)
    }


}