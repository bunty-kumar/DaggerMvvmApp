package com.bunty.daggermvvmapp.viewmodel

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class ProductViewModel2 @Inject constructor(private val randomize: Randomize) : ViewModel() {
    init {
        randomize.doAction()
    }
}