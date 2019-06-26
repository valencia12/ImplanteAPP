package com.project.appicoclear

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.project.appicoclear.activites.loginAction.LoginActivity
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.FirebaseUser
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private lateinit var dbReference: DatabaseReference
    private lateinit var database:FirebaseDatabase
    private lateinit var auth:FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        database = FirebaseDatabase.getInstance()

        auth = FirebaseAuth.getInstance()
        dbReference = database.reference.child("User")

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
        val name = input_name.text.toString()
        val lastname= input_name2.text.toString()
        if(email.isEmpty() || password.isEmpty() || name.isEmpty() || lastname.isEmpty()){

            Toast.makeText(this, "Please fill the inputs", Toast.LENGTH_SHORT).show()
            return
        }else{

        Log.d("MainActivity","Email is" + email)
        Log.d("MainActivity","Password is + $password")

        //Firebase authentication to create a user with email and password, maybe user
        auth.createUserWithEmailAndPassword(email, password)
            .addOnCompleteListener{
                if(!it.isSuccessful) return@addOnCompleteListener
                Log.d("Main","Usuario creado: ${it.result?.user?.uid}")
                val user:FirebaseUser?=auth.currentUser
                val userDB = user?.uid?.let { it1 -> dbReference.child(it1) }

                if (userDB != null) {
                    userDB.child("Name").setValue(name)
                    userDB.child("last name").setValue(lastname)
                }

                Toast.makeText(this, "isSuccessful", Toast.LENGTH_SHORT).show()
                startActivity(Intent(this, LoginActivity::class.java))

            }
            .addOnFailureListener {
                Log.d("Main", "Error al crear usuario: ${it.message}")
                Toast.makeText(this, "${it.message}", Toast.LENGTH_SHORT).show()
            }
        }
    }

}

