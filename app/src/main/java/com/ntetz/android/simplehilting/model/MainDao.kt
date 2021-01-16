package com.ntetz.android.simplehilting.model

import android.content.Context
import javax.inject.Inject

interface IMainDao {
    fun fetch(context: Context)
}

class MainDao @Inject constructor() : IMainDao {
    override fun fetch(context: Context) {
        println("fetch Using context $context is completed!")
    }
}
