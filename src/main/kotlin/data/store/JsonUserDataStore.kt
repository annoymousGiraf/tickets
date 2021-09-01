package data.store

import dto.UserDTO

class JsonUserDataStore(private val jsonDataStore: List<UserDTO>) : UserDataStore{
    override fun findUserById(id: Int) : UserDTO {
        return jsonDataStore.first { it._id == id }
    }

    override fun findAllUsers(): Collection<UserDTO> {
        return jsonDataStore
    }
}