package com.ntetz.android.simplehilting.model

import javax.inject.Inject

interface IMainUsecase {
    fun fetch()
}

class MainUsecase @Inject constructor(private val repo: IMainRepository) : IMainUsecase {
    override fun fetch() {
        println("start usecase fetch!")
        repo.fetch()
    }
}
