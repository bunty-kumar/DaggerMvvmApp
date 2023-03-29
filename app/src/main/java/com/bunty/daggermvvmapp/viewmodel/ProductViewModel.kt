package com.bunty.daggermvvmapp.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.bunty.daggermvvmapp.models.Product
import com.bunty.daggermvvmapp.repository.ProductRepository
import com.bunty.daggermvvmapp.utils.Constants.TAG
import kotlinx.coroutines.launch
import javax.inject.Inject

class ProductViewModel @Inject constructor(
    private val productRepository: ProductRepository,
    private val randomize: Randomize
) : ViewModel() {

    val productLiveData: LiveData<List<Product>>
        get() = productRepository.products

    init {
        viewModelScope.launch {
            productRepository.getProducts()
        }
    }
}

class Randomize @Inject constructor() {
    fun doAction() {
        Log.d(TAG, "doAction: Random Action")
    }
}