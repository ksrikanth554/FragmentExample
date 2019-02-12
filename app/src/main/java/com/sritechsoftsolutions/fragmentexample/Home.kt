package com.sritechsoftsolutions.fragmentexample

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import kotlinx.android.synthetic.main.home.*
import kotlinx.android.synthetic.main.home.view.*

class Home:Fragment() {
    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        var v=inflater.inflate(R.layout.home,container,false)

        v.clickme.setOnClickListener {
            Toast.makeText(activity,"You just clicked me",Toast.LENGTH_SHORT).show()
        }
        return v
    }
}