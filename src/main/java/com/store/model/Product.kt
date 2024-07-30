package com.store.model

import com.fasterxml.jackson.databind.annotation.JsonDeserialize
import jakarta.validation.constraints.NotNull
import jakarta.validation.constraints.Positive
import java.util.concurrent.atomic.AtomicInteger

data class Product(
    @field:NotNull @field:JsonDeserialize(using = StrictStringDeserializer::class) val name: String = "",
    @field:NotNull val type: String = "gadget",
    @field:NotNull @field:Positive val inventory: Int = 0,
    val id: Int = idGenerator.getAndIncrement(),
    val newField: Int? = null
) {
    companion object {
        val idGenerator: AtomicInteger = AtomicInteger()
    }
}

enum class ProductType {
    book,
    food,
    gadget,
    other
}