package com.example.appicoclear.activites.viewsAccounts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.appicoclear.R
import com.example.appicoclear.activites.loginAction.LoginActivity
import com.example.appicoclear.activites.viewsAccounts.actionTherapist.playSounds
import kotlinx.android.synthetic.main.activity_home_user.*
import kotlinx.android.synthetic.main.activity_main.*

class HomeUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_user)
        playSounds1.setOnClickListener(){
            startActivity(Intent(this, playSounds::class.java))
        }
    }
}
