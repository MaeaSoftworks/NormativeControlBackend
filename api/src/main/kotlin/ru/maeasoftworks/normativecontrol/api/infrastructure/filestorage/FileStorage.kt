package ru.maeasoftworks.normativecontrol.api.infrastructure.filestorage

import kotlinx.coroutines.flow.Flow
import java.nio.ByteBuffer

interface FileStorage {
    suspend fun putObject(file: ByteArray, objectName: String, vararg tags: Pair<String, String>)

    suspend fun getTags(objectName: String): Map<String, String>?

    suspend fun getObject(objectName: String): Flow<ByteBuffer>

    companion object: FileStorage {
        private var instance: FileStorage = InMemoryFileStorage

        @JvmStatic
        fun initialize(storage: FileStorage) {
            instance = storage
        }

        override suspend fun putObject(file: ByteArray, objectName: String, vararg tags: Pair<String, String>) = instance.putObject(file, objectName, *tags)

        override suspend fun getTags(objectName: String): Map<String, String>? = instance.getTags(objectName)

        override suspend fun getObject(objectName: String): Flow<ByteBuffer> = instance.getObject(objectName)
    }
}