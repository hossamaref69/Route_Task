package com.example.data.data_source.remote

import com.example.domain.model.Product


interface RemoteDataSource {
    suspend fun getProducts(): List<Product>
}