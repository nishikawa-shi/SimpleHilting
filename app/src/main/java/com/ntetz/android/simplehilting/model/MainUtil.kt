package com.ntetz.android.simplehilting.model

import android.net.Uri
import javax.inject.Inject

interface IMainUtil {
    fun getQueryStringValue(urlStr: String): String?
}

// depends on android classes, so this is desired to be replaced when unit test.
class MainUtil @Inject constructor() : IMainUtil {
    override fun getQueryStringValue(urlStr: String): String? =
        Uri.parse(urlStr).getQueryParameter("queryKeyName")
}
