package com.cyrilmottier.android.puzzlers.base

import android.util.Log

private const val TAG = "Puzzlers"

fun trace(message: Any?) {
    Log.d(TAG, message?.toString())
}
