package com.example.data.api


import com.example.data.models.ProductResponse
import com.example.domain.model.Product
import retrofit2.http.GET

interface WebServices {

    @GET("/products")
    suspend fun getProducts(): ProductResponse
}