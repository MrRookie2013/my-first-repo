package com.vcard.sg.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.vcard.sg.R

class vCardFragment : Fragment() {

    companion object {
        fun newInstance(): vCardFragment {
            return vCardFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {



        return inflater?.inflate(R.layout.fragment_vcard, container, false)
    }
}