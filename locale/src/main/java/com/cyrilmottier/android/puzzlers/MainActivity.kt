package com.cyrilmottier.android.puzzlers

import android.app.Activity
import android.os.Bundle
import android.os.LocaleList
import com.cyrilmottier.android.puzzlers.base.trace
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // User’s locale preferences are set to: en_US, fr_FR, es_ES
        trace("${LocaleList.getDefault()}, " +
            "${Locale.getDefault()}, ${text_view.text}"
        )
    }
}

// What will it trace?

// A: [fr,es], fr, Bonjour monde !
// B: [en_US,fr_FR,es_ES], fr_FR, Bonjour monde !
// C: [en_US,fr_FR,es_ES], en_US, Bonjour monde !
// D: Resources.NotFoundException
