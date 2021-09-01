package data.factory

import data.factory.DataStoreFactory.DataEntity.*
import data.factory.DataStoreFactory.DataStoreType.*
import data.store.DataStore
import data.store.JsonTicketDataStore
import data.store.JsonUserDataStore
import extnetion.dataStoreType
import reader.TicketJsonFileReader
import reader.UserJsonFileReader
import java.lang.IllegalArgumentException
import java.net.URL



class DataStoreFactory {


    enum class DataStoreType(val storeType: String) {
        JSON_DATA_STORE("json"),
        REMOTE_DATA_STORE("remote_url");
    }

    enum class DataEntity {
        TICKETS,
        USERS
    }


    companion object {
        fun  createDataStore(url : URL, entityType : DataEntity) : Any = when(url.dataStoreType()) {
            JSON_DATA_STORE.storeType -> {
                when(entityType) {
                    TICKETS -> {
                        val jsonFileReader  = TicketJsonFileReader(url)
                        JsonTicketDataStore(jsonFileReader.ticketsDTO)
                    }
                    USERS -> {
                        val jsonFileReader  = UserJsonFileReader(url)
                        JsonUserDataStore(jsonFileReader.usersDTO)
                    }
                }

            }
            else -> Error("unsupported data store")
        }
    }


}