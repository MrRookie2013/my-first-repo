package com.vcard.sg.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.vcard.sg.R
import kotlinx.android.synthetic.main.activity_signup_contact_selection.*

class SignupContactSelectionActivity : AppCompatActivity() {

    private val clickListener = View.OnClickListener { view ->
        when (view.getId()) {
            R.id.tvChooseContact -> chooseContact()
            R.id.tvCreateNewContact -> createNewContatc()
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup_contact_selection)

        tvChooseContact.setOnClickListener(clickListener)
        tvCreateNewContact.setOnClickListener(clickListener)
    }

    private fun chooseContact() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    private fun createNewContatc() {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
}