package com.bunty.daggermvvmapp.di

import androidx.lifecycle.ViewModel
import com.bunty.daggermvvmapp.viewmodel.ProductViewModel
import com.bunty.daggermvvmapp.viewmodel.ProductViewModel2
import dagger.Binds
import dagger.Module
import dagger.multibindings.ClassKey
import dagger.multibindings.IntoMap
import dagger.multibindings.StringKey

@Module
abstract class ViewModelModule {
    @Binds
    @ClassKey(ProductViewModel::class)
    @IntoMap
    abstract fun productViewModel(productViewModel: ProductViewModel): ViewModel

    @Binds
    @ClassKey(ProductViewModel2::class)
    @IntoMap
    abstract fun productViewModel2(productViewModel2: ProductViewModel2): ViewModel
}