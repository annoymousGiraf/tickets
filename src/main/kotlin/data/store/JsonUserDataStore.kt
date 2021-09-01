package data.store

import dto.UserDTO

class JsonUserDataStore(private val jsonDataStore: List<UserDTO>) : UserDataStore{
    override fun findUserById(id: Int) : UserDTO {
        return jsonDataStore.filter { it._id == id }.first()
    }
}