package com.stay.staytionery.base

import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.Toolbar
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {
    protected fun setSupportActionBar(toolbar: Toolbar) {
        (activity as AppCompatActivity).setSupportActionBar(toolbar)
    }
}