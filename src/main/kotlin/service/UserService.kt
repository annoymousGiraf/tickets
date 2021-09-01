package service

import data.store.UserDataStore
import dto.UserDTO

class UserService(val userDataStore: UserDataStore) {
    fun findUserById(id : Int) :  UserDTO {
        return userDataStore.findUserById(id)
    }
}