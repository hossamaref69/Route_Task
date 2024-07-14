package com.example.routetask.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.domain.model.Product
import com.example.domain.usecase.GetProductUseCase
import com.example.routetask.model.ViewMessage
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ProductViewModel @Inject
constructor(
    private val getProductUseCase: GetProductUseCase
) : ViewModel() {
    var productListLiveData = MutableLiveData<List<Product?>>()
    var viewMessageLiveData = MutableLiveData<ViewMessage>()

    fun getAllProducts() {
        viewModelScope.launch {
            try {
                val products = getProductUseCase.execute()
                productListLiveData.postValue(products)
            } catch (e: Exception) {
                viewMessageLiveData.value = ViewMessage(
                    "Error",
                    e.localizedMessage,
                    posButtonTitle = "Ok"
                )
            }
        }
    }
}