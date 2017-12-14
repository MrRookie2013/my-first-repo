package com.vcard.sg.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.vcard.sg.R
import kotlinx.android.synthetic.main.activity_signup.*

class SignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)

        addOnClickListener()
    }

    private fun addOnClickListener() {
        val clickListener = View.OnClickListener { view ->
            when (view.getId()) {
                R.id.btnCreate -> create()
            }
        }

        btnCreate.setOnClickListener(clickListener)
    }

    private fun create() {
        val intent = Intent(this, SignupVerificationActivity::class.java)
        startActivity(intent)
    }
}