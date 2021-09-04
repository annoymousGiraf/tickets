package dto.test.data.factory

import data.factory.DataStoreFactory
import data.factory.DataStoreFactory.DataEntity.*
import data.store.JsonTicketDataStore
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance

import kotlin.test.assertSame

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class DataStoreFactoryTest {

    @Test
    fun `should create data store instance from json input file`(){
        val datastore : JsonTicketDataStore =
            DataStoreFactory.createDataStore({}.javaClass.classLoader.getResource("tickets.json").toURI(), TICKETS) as JsonTicketDataStore

        assertSame(JsonTicketDataStore::class.java,datastore.javaClass)
    }

}