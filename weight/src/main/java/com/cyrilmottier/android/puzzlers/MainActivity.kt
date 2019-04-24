package com.cyrilmottier.android.puzzlers

import android.app.Activity
import android.os.Bundle
import com.cyrilmottier.android.puzzlers.base.trace
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        linear_layout.addOnLayoutChangeListener { v, _, _, _, _, _, _, _, _ ->
            trace(
                "LL: ${linear_layout.width}px, " +
                        "TV1: ${text_view_1.width}px, " +
                        "TV2: ${text_view_2.width}px"
            )
        }
    }
}


// What will it trace?

// A: LL: 400px, TV1: 267px, TV2: 133px
// B: LL: 500px, TV1: 300px, TV2: 200px
// C: LL: 400px, TV1: 233px, TV2: 167px
// D: LL: 400px, TV1: 300px, TV2: 200px
