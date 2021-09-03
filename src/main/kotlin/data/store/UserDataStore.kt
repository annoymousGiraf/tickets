package data.store

import dto.UserDTO
import java.time.ZonedDateTime

interface UserDataStore : DataStore {
    fun findUserById(id : Int) : UserDTO
    fun findAllUsers() : Collection<UserDTO>
    fun findUserByName(name: String): Collection<UserDTO>
    fun findVerifiedUsers(): Collection<UserDTO>
    fun findUnVerifiedUsers(): Collection<UserDTO>
    fun findUsersByCreatedTime(time: ZonedDateTime): Collection<UserDTO>
}
