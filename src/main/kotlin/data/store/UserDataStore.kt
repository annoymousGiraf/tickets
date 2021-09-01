package data.store

import dto.UserDTO

interface UserDataStore : DataStore {
    fun findUserById(id : Int) : UserDTO
    fun findAllUsers() : Collection<UserDTO>
}
