package service

import data.store.UserDataStore
import dto.UserDTO

class UserService(private val userDataStore: UserDataStore) {

    fun findUserById(id : Int) :  UserDTO {
        return userDataStore.findUserById(id)
    }

    fun findAllUsers(): List<UserDTO> {
        return userDataStore.findAllUsers().toList()
    }
}