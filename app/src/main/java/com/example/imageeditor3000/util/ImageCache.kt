package com.example.imageeditor3000.util



import com.example.imageeditor3000.data.model.ImageData

/**
 * Caché global para compartir imágenes entre ViewModels
 */
object ImageCache {
    private val cache = mutableMapOf<String, ImageData>()

    fun put(imageData: ImageData) {
        cache[imageData.id] = imageData
    }

    fun get(imageId: String): ImageData? {
        return cache[imageId]
    }

    fun remove(imageId: String) {
        cache.remove(imageId)
    }

    fun clear() {
        cache.values.forEach { it.bitmap?.recycle() }
        cache.clear()
    }

    fun getAll(): List<ImageData> {
        return cache.values.toList()
    }
}
