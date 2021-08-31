package extnetion

import data.factory.DataStoreFactory
import java.io.File
import java.net.URL

fun URL.dataStoreType() : String {
    val file = File(this.file)
    return if (file.isFile) file.extension else DataStoreFactory.DataStoreType.REMOTE_DATA_STORE.storeType
}