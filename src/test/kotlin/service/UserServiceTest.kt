package dto.test.data.service

import com.fasterxml.jackson.datatype.jsr310.JavaTimeModule
import com.fasterxml.jackson.module.kotlin.jacksonObjectMapper
import com.fasterxml.jackson.module.kotlin.readValue
import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataEntity.*
import data.store.DataStore
import data.store.UserDataStore
import dto.UserDTO
import dto.test.data.allUsersJson
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import service.UserService
import java.time.ZonedDateTime
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UserServiceTest {
    private val jsonUserDataStore : DataStore
    private val userService : UserService
    private val usersFromJson : List<UserDTO> =  jacksonObjectMapper()
        .registerModule(JavaTimeModule())
        .readValue(allUsersJson)

    init {
        val urlToJson = {}.javaClass.classLoader.getResource("users.json").toURI()
        jsonUserDataStore = DataStoreFactory.createDataStore(urlToJson, USERS) as DataStore
        userService = UserService(jsonUserDataStore as UserDataStore)
    }

    @Test
    fun `search user by id should return user`() {
        //Given
        val givenAssigneeId = 24
        val expectedName = "Harris Côpeland"
        //When
        val user : UserDTO = userService.findUserById(givenAssigneeId) ?: UserDTO(1,"", ZonedDateTime.now(),false)

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

    @Test
    fun `search user by name should return users`() {
        //Given
        val givenName = "Harris Côpeland"
        val expectedUsers = usersFromJson.filter { it.name == givenName }
        //When
        val users : List<UserDTO> = userService.findUserByName(givenName)
        //Then
        assertIterableEquals(expectedUsers, users)
    }

    @Test
    fun `search user by verfied should return users`() {
        //Given
        val isVerified = true
        val expectedUsers = usersFromJson.filter { it.verified == isVerified }
        //When
        val users : List<UserDTO> = userService.findVerifiedUsers()
        //Then
        assertIterableEquals(expectedUsers, users)
    }

    @Test
    fun `search user by unverified should return users`() {
        //Given
        val isVerified = false
        val expectedUsers = usersFromJson.filter { it.verified == isVerified }
        //When
        val users : List<UserDTO> = userService.findUnVerfiedUsers()
        //Then
        assertIterableEquals(expectedUsers, users)
    }


    @Test
    fun `search user by date should returned users created on the date`() {
        //Given
        val givenTime = ZonedDateTime.parse("2016-06-23T10:31:39-10:00")
        val expectedUsers = usersFromJson.filter { it.created_at.isEqual(givenTime) }
        //When
        val users = userService.findAllUserByCreatedDate(givenTime)
        //Then
        assertEquals(1,users.size)
        assertIterableEquals(expectedUsers, users)
    }

}