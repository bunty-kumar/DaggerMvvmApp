package com.bunty.daggermvvmapp.di

import android.content.Context
import androidx.room.Room
import com.bunty.daggermvvmapp.db.ProductDb
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class DatabaseModule {

    @Singleton
    @Provides
    fun provideProductDb(context: Context): ProductDb {
        return Room.databaseBuilder(context, ProductDb::class.java, "FakerDb").build()
    }

}