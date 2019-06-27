package com.project.appicoclear.activites.loginAction

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.project.appicoclear.MainActivity
import com.project.appicoclear.R
import com.project.appicoclear.activites.viewsAccounts.HomeUser
import com.google.firebase.auth.FirebaseAuth
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        btn_login.setOnClickListener{
            loginUser()
        }

        link_signup.setOnClickListener(){
            val intent:Intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

    }

    private fun loginUser(){
        val email = input_email.text.toString()
        val password = input_password.text.toString()

        Log.d("Login", "Has iniciado sesion con ${email}")

        Toast.makeText(this, "has iniciado sesion como: ${email}", Toast.LENGTH_SHORT).show()

        if(email.isEmpty() || password.isEmpty()){
            Toast.makeText(this, "Please fill the inputs", Toast.LENGTH_SHORT).show()
            return
        }else{
            FirebaseAuth.getInstance().signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this){
                    if(it.isSuccessful){
                        action()
                    }else{
                        Toast.makeText(this, "User not found", Toast.LENGTH_SHORT).show()
                    }
                }
        }

    }

    private fun action(){
        startActivity(Intent(this, HomeUser::class.java))
    }
}
