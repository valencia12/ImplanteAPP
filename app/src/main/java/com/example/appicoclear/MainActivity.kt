package com.example.appicoclear

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.appicoclear.loginAction.LoginActivity
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        link_login.setOnClickListener(){
            val intent: Intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        btn_signup.setOnClickListener{
            dataRegister()
        }
    }
    private fun dataRegister(){
        val email = input_email.text.toString()
        val password = input_password.text.toString()

        if(email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Please fill the inputs", Toast.LENGTH_SHORT).show()
            return
        }

        Log.d("MainActivity","Email is" + email)
        Log.d("MainActivity","Password is + $password")

        //Firebase authentication to create a user with email and password, maybe user
        FirebaseAuth.getInstance().createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener{
                if(!it.isSuccessful) return@addOnCompleteListener

                Log.d("Main","Usuario creado: ${it.result?.user?.uid}")
                Toast.makeText(this, "isSuccessful", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))
            }
            .addOnFailureListener {
                Log.d("Main", "Error al crear usuario: ${it.message}")
                Toast.makeText(this, "${it.message}", Toast.LENGTH_SHORT).show()
            }
    }

}

