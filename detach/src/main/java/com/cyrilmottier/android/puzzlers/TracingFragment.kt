package com.cyrilmottier.android.puzzlers

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.cyrilmottier.android.puzzlers.base.trace

class TracingFragment : Fragment() {
    override fun onAttach(context: Context?) {
        super.onAttach(context)
        trace("onAttach")
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        trace("onCreate")
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        trace("onCreateView")
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    override fun onDestroyView() {
        trace("onDestroyView")
        super.onDestroyView()
    }

    override fun onDestroy() {
        trace("onDestroy")
        super.onDestroy()
    }

    override fun onDetach() {
        trace("onDetach")
        super.onDetach()
    }
}
