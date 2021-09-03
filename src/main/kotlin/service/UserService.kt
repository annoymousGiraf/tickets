package service

import data.store.UserDataStore
import dto.UserDTO
import java.time.ZonedDateTime

class UserService(private val userDataStore: UserDataStore) {

    fun findUserById(id : Int) :  UserDTO {
        return userDataStore.findUserById(id)
    }

    fun findAllUsers(): List<UserDTO> {
        return userDataStore.findAllUsers().toList()
    }

    fun findUserByName(name: String): List<UserDTO> {
        return userDataStore.findUserByName(name).toList()
    }

    fun findVerifiedUsers(): List<UserDTO> = userDataStore
            .findVerifiedUsers()
            .toList()


    fun findUnVerfiedUsers(): List<UserDTO> = userDataStore
            .findUnVerifiedUsers()
            .toList()

    fun findAllUserByCreatedDate(time: ZonedDateTime): List<UserDTO> = userDataStore
        .findUsersByCreatedTime(time)
        .toList()

}