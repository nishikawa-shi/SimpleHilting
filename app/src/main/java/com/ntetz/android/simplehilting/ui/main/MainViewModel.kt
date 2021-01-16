package com.ntetz.android.simplehilting.ui.main

import androidx.hilt.lifecycle.ViewModelInject
import androidx.lifecycle.ViewModel
import com.ntetz.android.simplehilting.model.IMainUsecase

class MainViewModel @ViewModelInject constructor(private val usecase: IMainUsecase) : ViewModel() {

    fun fetchUsecase() {
        usecase.fetch()
    }
}
