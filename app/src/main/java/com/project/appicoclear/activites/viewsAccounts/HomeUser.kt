package com.project.appicoclear.activites.viewsAccounts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.project.appicoclear.R
import com.project.appicoclear.activites.loginAction.LoginActivity
import com.project.appicoclear.activites.viewsAccounts.Levels.MainLevelActivity
//import com.project.appicoclear.activites.viewsAccounts.actionTherapist.playSounds1
import kotlinx.android.synthetic.main.activity_home_user.*

class HomeUser : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_user)
        playSounds1.setOnClickListener(){
            val intent:Intent = Intent( this, MainLevelActivity::class.java)
            intent.putExtra("opc","1")
            startActivity(intent)
        }

        playSounds2.setOnClickListener(){
            val intent:Intent = Intent( this, MainLevelActivity::class.java)
            intent.putExtra("opc","2")
            startActivity(intent)
        }

        playSounds3.setOnClickListener(){
            val intent:Intent = Intent( this, MainLevelActivity::class.java)
            intent.putExtra("opc","3")
            startActivity(intent)
        }

        playSounds4.setOnClickListener(){
            val intent:Intent = Intent( this, MainLevelActivity::class.java)
            intent.putExtra("opc","4")
            startActivity(intent)
        }
        dataPatient1.setOnClickListener(){
            val intent: Intent = Intent(this, RegisterPatient::class.java)
            startActivity(intent)
        }
    }
}
