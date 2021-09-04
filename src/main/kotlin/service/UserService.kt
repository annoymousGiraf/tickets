package service

import data.store.UserDataStore
import dto.UserDTO
import mu.KotlinLogging
import java.time.ZonedDateTime

class UserService(private val userDataStore: UserDataStore) {
    private val logger = KotlinLogging.logger {}

    fun findUserById(id : Int) :  UserDTO? = userDataStore
        .findUserById(id)
        .also { logger.debug {  "searching user by id = $id" } }

    fun findAllUsers(): List<UserDTO> = userDataStore
        .findAllUsers()
        .toList()
        .also { logger.debug { "getting all users" } }

    fun findUserByName(name: String): List<UserDTO> = userDataStore
        .findUserByName(name)
        .toList()
        .also { logger.debug { "find user name by name = $name" } }


    fun findVerifiedUsers(): List<UserDTO> = userDataStore
            .findVerifiedUsers()
            .toList()
            .also { logger.debug { "getting all verified users" } }


    fun findUnVerfiedUsers(): List<UserDTO> = userDataStore
            .findUnVerifiedUsers()
            .toList()
            .also { logger.debug { "getting all unverified users" } }

    fun findAllUserByCreatedDate(time: ZonedDateTime): List<UserDTO> = userDataStore
        .findUsersByCreatedTime(time)
        .toList()
        .also { logger.debug { "find user name by date = $time" } }

}