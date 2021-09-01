package data.factory

import data.factory.DataStoreFactory.DataEntity.*
import data.factory.DataStoreFactory.DataStoreType.*
import data.store.DataStore
import data.store.JsonTicketDataStore
import extnetion.dataStoreType
import reader.TicketJsonFileReader
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
        fun  createDataStore(url : URL, entityType : DataEntity) : DataStore = when(url.dataStoreType()) {
            JSON_DATA_STORE.storeType -> {


                when(entityType) {
                    TICKETS -> {
                        val jsonFileReader  = TicketJsonFileReader(url)
                        JsonTicketDataStore(jsonFileReader.loadTickets())
                    }
                    else -> throw IllegalArgumentException("unsupported entity store")
                }

            }
            else -> throw IllegalArgumentException("unsupported data store")
        }
    }


}