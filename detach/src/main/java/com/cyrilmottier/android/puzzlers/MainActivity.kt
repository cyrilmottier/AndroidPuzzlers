package com.cyrilmottier.android.puzzlers

import android.os.Bundle
import androidx.fragment.app.FragmentActivity

class MainActivity : FragmentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fragment = TracingFragment()

        supportFragmentManager.beginTransaction()
            .add(android.R.id.content, fragment, "fragment:puzzler")
            .commit()

        supportFragmentManager.beginTransaction()
            .detach(fragment)
            .commit()
    }


    override fun onSaveInstanceState(outState: Bundle?) {
        // For the simplicity of this puzzler,
        // let’s consider state is never ever saved
    }

}

// What will it trace?

// A: onAttach, onCreate, onCreateView, onDestroyView, onDestroy, onDetach
// B: onAttach, onCreate, onCreateView, onDestroyView
// C: onCreate, onDestroy
// D: Nothing
