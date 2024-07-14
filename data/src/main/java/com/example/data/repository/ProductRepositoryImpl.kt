package com.example.data.repository

import com.example.data.data_source.remote.RemoteDataSource
import com.example.domain.model.Product
import com.example.domain.repository.ProductRepository
import javax.inject.Inject

class ProductRepositoryImpl @Inject constructor(
    private val remoteDataSource: RemoteDataSource
) : ProductRepository{
    override suspend fun getProductsFromRemote(): List<Product> {
        return remoteDataSource.getProducts()
    }
}