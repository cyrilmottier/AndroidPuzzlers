package com.cyrilmottier.android.puzzlers

import android.app.Activity
import android.os.Bundle
import com.cyrilmottier.android.puzzlers.base.trace

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val classNames = arrayOf(
            R.drawable.level_list,
            R.drawable.layer_list,
            R.drawable.shape
        ).map {
            getDrawable(it)::class.java.simpleName
        }

        trace(classNames.joinToString(", "))
    }
}

// What will it trace?

// A: LevelListDrawable, LayerListDrawable, ShapeDrawable
// B: LevelDrawable, LayerListDrawable, ShapeDrawable
// C: LevelListDrawable, LayerDrawable, GradientDrawable
// D: throws InflateException
