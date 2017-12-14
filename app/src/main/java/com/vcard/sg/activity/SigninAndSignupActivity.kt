package com.vcard.sg.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.vcard.sg.R
import kotlinx.android.synthetic.main.activity_signin_and_signup.*

class SigninAndSignupActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin_and_signup)

        addOnClickListener()
    }

    private fun addOnClickListener() {
        val clickListener = View.OnClickListener { view ->
            when (view.getId()) {
                R.id.btnSignin -> showSignin()
                R.id.btnRegister -> showRegister()
            }
        }

        btnSignin.setOnClickListener(clickListener)
        btnRegister.setOnClickListener(clickListener)
    }

    private fun showSignin() {
        val intent = Intent(this, SigninActivity::class.java)
        startActivity(intent)
    }

    private fun showRegister() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    override fun onBackPressed() {
        val count = fragmentManager.backStackEntryCount

        if (count == 0) {
            super.onBackPressed()
        } else {
            fragmentManager.popBackStack()
        }
    }
}
