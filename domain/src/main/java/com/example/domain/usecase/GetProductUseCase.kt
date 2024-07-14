package com.example.domain.usecase

import com.example.domain.model.Product
import com.example.domain.repository.ProductRepository
import javax.inject.Inject


class GetProductUseCase @Inject constructor(
    private val productsRepository: ProductRepository
) {
    suspend fun execute(): List<Product>{
        return productsRepository.getProductsFromRemote()
    }
}