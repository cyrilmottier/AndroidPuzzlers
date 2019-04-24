package com.cyrilmottier.android.puzzlers

import android.app.Activity
import android.os.Bundle
import com.cyrilmottier.android.puzzlers.base.trace
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        trace(
            "start=${text.paddingStart} " +
                    "top=${text.paddingTop} " +
                    "end=${text.paddingEnd} " +
                    "bottom=${text.paddingBottom}"
        )
    }
}

// What will it trace?

// A: start=5 top=5 end=5 bottom=5
// B: start=9 top=5 end=10 bottom=6
// C: start=2 top=4 end=3 bottom=1
// D: start=11 top=5 end=7 bottom=5
