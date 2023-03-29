package com.bunty.daggermvvmapp.di

import android.content.Context
import androidx.lifecycle.ViewModel
import com.bunty.daggermvvmapp.MainActivity
import dagger.BindsInstance
import dagger.Component
import javax.inject.Singleton

@Singleton
@Component(modules = [NetworkModule::class, DatabaseModule::class, ViewModelModule::class])
interface ApplicationComponents {
    fun inject(mainActivity: MainActivity)

    fun getMap(): Map<Class<*>, ViewModel>

    @Component.Factory
    interface Factory {
        fun create(@BindsInstance context: Context): ApplicationComponents
    }
}