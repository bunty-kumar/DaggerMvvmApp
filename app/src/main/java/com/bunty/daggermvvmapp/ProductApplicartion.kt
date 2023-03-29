package com.bunty.daggermvvmapp

import android.app.Application
import com.bunty.daggermvvmapp.di.ApplicationComponents
import com.bunty.daggermvvmapp.di.DaggerApplicationComponents

class ProductApplication : Application() {
    lateinit var applicationComponents: ApplicationComponents
    override fun onCreate() {
        super.onCreate()
        applicationComponents = DaggerApplicationComponents.factory().create(this)
    }
}