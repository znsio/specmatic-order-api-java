package com.store.controllers

import com.store.exceptions.NotFoundException
import com.store.exceptions.ValidationException
import com.store.model.Id
import com.store.model.Product
import com.store.model.User
import com.store.services.ProductService
import jakarta.validation.Valid
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.validation.annotation.Validated
import org.springframework.web.bind.annotation.*

private val typesOfProducts = listOf("gadget", "book", "food", "other")

@RestController
open class Products {

    @Autowired
    lateinit var productService: ProductService

    @GetMapping("/products/{id}")
    fun get(@PathVariable("id") id: Int): Product {
        try {
            return productService.getProduct(id)
        } catch (e: NoSuchElementException) {
            throw NotFoundException(e.message!!)
        }
    }

    @DeleteMapping("/products/{id}")
    fun delete(@PathVariable("id") id: Int, @AuthenticationPrincipal user: User): ResponseEntity<String> {
        productService.deleteProduct(id)
        return ResponseEntity(HttpStatus.OK)
    }
}
