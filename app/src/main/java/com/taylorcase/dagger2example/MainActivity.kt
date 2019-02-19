package com.taylorcase.dagger2example

import android.content.SharedPreferences
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var myClass: MyClass
    @Inject lateinit var sharedPref: SharedPreferences

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        (application as MyApplication).getComponent().inject(this)
    }

    override fun onStart() {
        super.onStart()

        // Example Toast that will show if sharedPref is not null
        // meaning it was injected successfully
        if (sharedPref != null) {
            Toast.makeText(this, "It worked. Shared Preferences is not null", Toast.LENGTH_LONG).show()
        }
    }
}
