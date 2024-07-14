package com.example.domain.repository

import com.example.domain.model.Product


interface ProductRepository {
    suspend fun getProductsFromRemote(): List<Product>
}