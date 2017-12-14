package com.vcard.sg.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.vcard.sg.R
import kotlinx.android.synthetic.main.activity_signup_create.*

class SignupCreateActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_create)

        val clickListener = View.OnClickListener { view ->
            when (view.getId()) {
                R.id.btnCreateAccount -> createAccount()
            }
        }

        btnCreateAccount.setOnClickListener(clickListener)
    }

    private fun createAccount() {
        val intent = Intent(this, SignupContactSelectionActivity::class.java)
        startActivity(intent)
    }
}