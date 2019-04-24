package com.cyrilmottier.android.puzzlers

import android.app.Activity
import android.content.Context
import android.os.Bundle
import com.cyrilmottier.android.puzzlers.base.trace

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val prefs = getSharedPreferences("test", Context.MODE_PRIVATE)

        prefs.edit()
            .putString("key", "hell")
            .apply()

        prefs.edit()
            .putString("key", null)
            .apply()

        val value = prefs.getString("key", "heaven")
        trace("Go to $value!")
    }

}

// What will it trace?

// A: Go to heaven!
// B: Go to hell!
// C: Go to null!
// D: Either A, B or C
