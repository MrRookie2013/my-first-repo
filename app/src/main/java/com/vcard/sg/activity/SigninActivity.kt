package com.vcard.sg.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import com.vcard.sg.R
import kotlinx.android.synthetic.main.activity_signin.*

class SigninActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)

        addOnClickListener()
    }

    private fun addOnClickListener() {
        val clickListener = View.OnClickListener { view ->
            when (view.getId()) {
                R.id.ibBack -> back()
                R.id.btnSubmit -> submit()
            }
        }

        ibBack.setOnClickListener(clickListener)
        btnSubmit.setOnClickListener(clickListener)
    }

    private fun back() {
        finish()
    }

    private fun submit() {
        Log.d("Setbud", "Submit")
    }
}