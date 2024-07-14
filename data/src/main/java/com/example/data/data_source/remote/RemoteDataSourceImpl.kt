package com.example.data.data_source.remote


import com.example.data.api.WebServices
import com.example.domain.model.Product
import javax.inject.Inject

class RemoteDataSourceImpl @Inject constructor (
private val webServices: WebServices
): RemoteDataSource {

    override suspend fun getProducts(): List<Product> {
        return webServices.getProducts().products?.filterNotNull()!!.map {
            it.products()
        }
    }
}