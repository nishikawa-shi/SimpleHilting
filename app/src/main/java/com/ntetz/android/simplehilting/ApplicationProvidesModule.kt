package com.ntetz.android.simplehilting

import android.content.Context
import com.ntetz.android.simplehilting.model.IMainDao
import com.ntetz.android.simplehilting.model.IMainRepository
import com.ntetz.android.simplehilting.model.MainRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object ApplicationProvidesModule {
    @Provides
    fun provideMainRepository(
        mainDao: IMainDao,
        @ApplicationContext context: Context
    ): IMainRepository = MainRepository(mainDao, context)
}
