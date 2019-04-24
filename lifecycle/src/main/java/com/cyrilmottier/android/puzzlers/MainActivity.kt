package com.cyrilmottier.android.puzzlers

import android.app.Activity
import android.os.Bundle
import com.cyrilmottier.android.puzzlers.base.trace

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        trace("onCreate")
        finish()
        trace("finish")
    }

    override fun onStart() {
        super.onStart()
        trace("onStart")
    }

    override fun onResume() {
        super.onResume()
        trace("onResume")
    }

    override fun onPause() {
        trace("onPause")
        super.onPause()
    }

    override fun onStop() {
        trace("onStop")
        super.onStop()
    }

    override fun onDestroy() {
        trace("onDestroy")
        super.onDestroy()
    }

}

// What will it trace?

// A: onCreate
// B: onCreate, finish, onStart, onResume, onPause, onStop, onDestroy
// C: onCreate, onStart, onResume, onPause, onStop, onDestroy
// D: onCreate, finish, onDestroy
