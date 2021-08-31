package dto.test.data.extnetion

import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataStoreType.*
import data.store.JsonFileDataStore
import extnetion.dataStoreType
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.net.URI
import java.net.URL
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UrlExtentionFunctionTest {

    @Test
    fun `extension should return json for URL to file`(){
        val givenURL = {}.javaClass.classLoader.getResource("tickets.json")

        assertEquals(JSON_DATA_STORE.storeType,givenURL.dataStoreType())
    }

    @Test
    fun `extension should return remote for URL is not a file`(){
        val givenURL = URI("http://localhost:8888/").toURL()

        assertEquals(REMOTE_DATA_STORE.storeType,givenURL.dataStoreType())
    }
}