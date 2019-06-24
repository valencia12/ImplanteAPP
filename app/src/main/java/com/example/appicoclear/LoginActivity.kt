package com.example.appicoclear

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener{
            val email = input_email.text.toString()
            val password = input_password.text.toString()

            Log.d("Login", "Has iniciado sesion con ${email}")

            Toast.makeText(this, "has iniciado sesion como: ${email}", Toast.LENGTH_SHORT).show()

            if(email.isEmpty() || password.isEmpty()){
                Toast.makeText(this, "Please fill the inputs", Toast.LENGTH_SHORT).show()
            }
        }



        link_signup.setOnClickListener(){
            val intent:Intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

    }
}
