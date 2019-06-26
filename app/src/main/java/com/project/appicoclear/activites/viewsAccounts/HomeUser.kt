package com.project.appicoclear.activites.viewsAccounts

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.project.appicoclear.R
import com.project.appicoclear.activites.viewsAccounts.actionTherapist.playSounds
import kotlinx.android.synthetic.main.activity_home_user.*

class HomeUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_user)
        playSounds1.setOnClickListener(){
            startActivity(Intent(this, playSounds::class.java))
        }
    }
}
