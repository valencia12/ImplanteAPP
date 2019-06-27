package com.project.appicoclear.activites.viewsAccounts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.appicoclear.R
import com.project.appicoclear.activites.loginAction.LoginActivity
import com.project.appicoclear.activites.viewsAccounts.actionTherapist.playSounds
import kotlinx.android.synthetic.main.activity_home_user.*

class HomeUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_user)
        playSounds1.setOnClickListener(){
            startActivity(Intent(this, playSounds::class.java))
        }
        dataPatient1.setOnClickListener(){
            val intent: Intent = Intent(this, RegisterPatient::class.java)
            startActivity(intent)
        }
    }
}
