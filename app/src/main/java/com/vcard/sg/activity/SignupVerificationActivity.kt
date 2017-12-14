package com.vcard.sg.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.vcard.sg.R
import kotlinx.android.synthetic.main.activity_signup_verification.*

class SignupVerificationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_verification)

        addOnClickListener()
    }

    private fun addOnClickListener() {
        val clickListener = View.OnClickListener { view ->
            when (view.getId()) {
                R.id.btnVerification -> verification()
            }
        }

        btnVerification.setOnClickListener(clickListener)
    }

    private fun verification() {
        val intent = Intent(this, SignupCreateActivity::class.java)
        startActivity(intent)
    }
}