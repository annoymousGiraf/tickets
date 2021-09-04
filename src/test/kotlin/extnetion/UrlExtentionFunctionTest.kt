package dto.test.data.extnetion

import data.factory.DataStoreFactory.DataStoreType.*
import extnetion.dataStoreType
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import java.net.URI
import kotlin.test.assertEquals

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class UrlExtentionFunctionTest {

    @Test
    fun `extension should return json for URL to file`(){
        val givenURL = {}.javaClass.classLoader.getResource("tickets.json").toURI()

        assertEquals(JSON_DATA_STORE.storeType,givenURL.dataStoreType())
    }

    @Test
    fun `extension should return remote for URL is not a file`(){
        val givenURL = URI("http://localhost:8888/")

        assertEquals(REMOTE_DATA_STORE.storeType,givenURL.dataStoreType())
    }
}