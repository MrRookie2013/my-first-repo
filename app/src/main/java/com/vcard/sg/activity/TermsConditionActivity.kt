package com.vcard.sg.activity

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import com.vcard.sg.R
import kotlinx.android.synthetic.main.activity_terms_condition.*


class TermsConditionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_terms_condition)

        addOnClickListener()
    }

    private fun addOnClickListener() {
        val clickListener = View.OnClickListener { view ->
            when (view.getId()) {
                R.id.tvAgreeAndContinue -> agreeAndContinue()
            }
        }

        tvAgreeAndContinue.setOnClickListener(clickListener)
    }

    private fun agreeAndContinue() {
        val intent = Intent(this, SignupActivity::class.java)
        startActivity(intent)
    }
}