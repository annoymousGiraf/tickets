package data.store

import dto.UserDTO
import java.time.ZonedDateTime

class JsonUserDataStore(private val jsonDataStore: List<UserDTO>) : UserDataStore{

    private val verifiedUsers = jsonDataStore.filter { it.verified  }
    val unVerifiedUsers = jsonDataStore - verifiedUsers

    override fun findUserById(id: Int) : UserDTO {
        return jsonDataStore.first { it._id == id }
    }

    override fun findAllUsers(): Collection<UserDTO> {
        return jsonDataStore
    }

    override fun findUserByName(name: String): Collection<UserDTO> = jsonDataStore.filter { it.name == name }

    override fun findVerifiedUsers(): Collection<UserDTO> {
        return verifiedUsers
    }

    override fun findUnVerifiedUsers(): Collection<UserDTO> {
        return unVerifiedUsers
    }

    override fun findUsersByCreatedTime(time: ZonedDateTime): Collection<UserDTO> {
        return jsonDataStore.filter { it.created_at.isEqual(time) }
    }
}