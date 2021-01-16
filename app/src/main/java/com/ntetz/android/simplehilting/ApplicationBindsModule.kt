package com.ntetz.android.simplehilting

import com.ntetz.android.simplehilting.model.IMainDao
import com.ntetz.android.simplehilting.model.IMainUtil
import com.ntetz.android.simplehilting.model.MainDao
import com.ntetz.android.simplehilting.model.MainUtil
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class ApplicationBindsModule {
    @Binds
    abstract fun bindMainUtil(mainUtil: MainUtil): IMainUtil

    @Binds
    abstract fun bindMainDao(mainDao: MainDao): IMainDao
}
