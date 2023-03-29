package com.bunty.daggermvvmapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.bunty.daggermvvmapp.repository.ProductRepository
import javax.inject.Inject

class ProductViewModelFactory @Inject constructor(
    private val map: Map<Class<*>, @JvmSuppressWildcards ViewModel>
) :
    ViewModelProvider.Factory {

    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return map[modelClass] as T
    }
}