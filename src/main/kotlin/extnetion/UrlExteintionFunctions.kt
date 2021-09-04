package extnetion

import data.factory.DataStoreFactory.DataStoreType.*
import java.io.File
import java.lang.Exception
import java.net.URI

fun URI.dataStoreType() : String {
    return try {
        val file = File(this)
        file.extension
    }
    catch (exception  : Exception) {
        REMOTE_DATA_STORE.storeType
    }
}