package com.vcard.sg.activity

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentTransaction
import android.support.v7.app.AppCompatActivity
import com.vcard.sg.R
import com.vcard.sg.fragment.ContactsFragment
import com.vcard.sg.fragment.NotificationsFragment
import com.vcard.sg.fragment.SettingsFragment
import com.vcard.sg.fragment.vCardFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.nav_contacts -> {
                replaceFragment(R.id.nav_contacts)
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_vcard -> {
                replaceFragment(R.id.nav_vcard)
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_notifications -> {
                replaceFragment(R.id.nav_notifications)
                return@OnNavigationItemSelectedListener true
            }

            R.id.nav_settings -> {
                replaceFragment(R.id.nav_settings)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
        supportFragmentManager
                .beginTransaction()
                .add(R.id.flContainer, ContactsFragment.newInstance(), "")
                .commit()
    }

    private fun replaceFragment(id : Int) {
        if(id == R.id.nav_contacts){
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.flContainer, ContactsFragment.newInstance(), "")
                    .commit()
        }else if(id == R.id.nav_vcard) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.flContainer, vCardFragment.newInstance(), "")
                    .commit()
        }else if(id == R.id.nav_notifications) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.flContainer, NotificationsFragment.newInstance(), "")
                    .commit()
        }else if(id == R.id.nav_settings) {
            supportFragmentManager
                    .beginTransaction()
                    .replace(R.id.flContainer, SettingsFragment.newInstance(), "")
                    .commit()
        }
    }

}
