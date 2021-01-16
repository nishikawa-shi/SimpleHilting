package com.ntetz.android.simplehilting

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ntetz.android.simplehilting.model.IMainRepository
import com.ntetz.android.simplehilting.model.IMainUtil
import com.ntetz.android.simplehilting.ui.main.MainFragment
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var util: IMainUtil

    @Inject
    lateinit var repo: IMainRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                    .replace(R.id.container, MainFragment.newInstance())
                    .commitNow()
        }
        println("util result is ${util.getQueryStringValue("https://ntetz.com/?queryKeyName=queryKeyValueTet")}")
        println("repo result is ${repo.fetch()}")
    }
}