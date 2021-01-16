package com.ntetz.android.simplehilting.model

import android.content.Context
import javax.inject.Inject

interface IMainRepository {
    fun fetch()
}

// using dao desired to be singleton for performance
class MainRepository @Inject constructor(
    private val dao: IMainDao,
    private val context: Context
) : IMainRepository {

    override fun fetch() {
        dao.fetch(context)
    }
}
