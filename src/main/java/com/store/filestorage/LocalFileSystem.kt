package com.store.filestorage

import java.io.File

class LocalFileSystem {
    companion object {
        fun saveImage(imageFileName: String, bytes: ByteArray): String {
            val file = File(".images/$imageFileName")
            file.parentFile.mkdirs()
            file.writeBytes(bytes)
            return file.canonicalPath
        }
    }
}