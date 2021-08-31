package data.factory

import data.factory.DataStoreFactory.DataStoreType.*
import data.store.JsonFileDataStore
import data.store.TicketDataStore
import extnetion.dataStoreType
import java.lang.IllegalArgumentException
import java.net.URL



class DataStoreFactory {

    enum class DataStoreType(val storeType: String) {
        JSON_DATA_STORE("json"),
        REMOTE_DATA_STORE("remote_url");
    }



    companion object {
        fun createDataStore(url : URL) : TicketDataStore = when(url.dataStoreType()) {
            JSON_DATA_STORE.storeType -> JsonFileDataStore(url)
            else -> throw IllegalArgumentException("unsupported data store")
        }
    }


}