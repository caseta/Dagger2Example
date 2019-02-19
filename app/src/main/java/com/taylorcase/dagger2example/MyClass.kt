package com.taylorcase.dagger2example

import android.content.Context
import javax.inject.Inject

class MyClass @Inject constructor(val context: Context) {

    fun isContextNull() : Boolean {
        return context != null
    }
}
