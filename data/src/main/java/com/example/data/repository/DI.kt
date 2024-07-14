package com.example.data.repository

import com.example.domain.repository.ProductRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


@Module
@InstallIn(SingletonComponent::class)
abstract class DI {

    @Binds
    abstract fun provideProductRepository(
        productRepositoryImpl: ProductRepositoryImpl
    ): ProductRepository

}