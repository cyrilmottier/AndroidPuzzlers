package com.cyrilmottier.android.puzzlers

import android.app.Activity
import android.os.Bundle
import android.widget.FrameLayout
import com.cyrilmottier.android.puzzlers.base.trace

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val parent = FrameLayout(this).apply {
            tag = "parent"
        }
        val result1 = layoutInflater.inflate(R.layout.view_inflate, parent)
        val result2 = layoutInflater.inflate(R.layout.view_inflate, null)

        trace("${result1.tag} and ${result2.tag}")
    }

}

// What will it trace?

// A: child and child
// B: parent and child
// C: throws NullPointerException
// D: Answer D
