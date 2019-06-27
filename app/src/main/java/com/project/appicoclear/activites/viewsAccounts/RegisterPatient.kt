package com.project.appicoclear.activites.viewsAccounts


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.database.DatabaseReference
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.project.appicoclear.R
import java.lang.Exception

class RegisterPatient : AppCompatActivity() {
    lateinit var dbReference: DatabaseReference
    lateinit var database:FirebaseDatabase

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_pattient)

        database = FirebaseDatabase.getInstance()
        dbReference = database.reference.child("User")
    }
    private fun DataP(){

        /*val name = findViewById<View>(R.id.name1) as EditText
        val apell = findViewById<View>(R.id.apell1) as EditText
        val age = findViewById<View>(R.id.age) as EditText
        val problem = findViewById<View>(R.id.problem) as EditText
        val descrip = findViewById<View>(R.id.description) as EditText


        var nam = name.text.toString().trim()
        val ape1 = apell.text.toString().trim()
        val age1 = age.text.toString().trim()
        val prom = problem.text.toString().trim()
        val des = descrip.text.toString().trim()

        if(!nam.isEmpty() && !ape1.isEmpty() && !age1.isEmpty() && !prom.isEmpty() && !des.isEmpty()){
            try{
                val items = HashMap<String, Any>()
                items.put("Name:", nam)
                items.put("Last Name:", ape1)
                items.put("age:", age1)
                items.put("Problem", prom)
                items.put("Description", descrip)
                db.collection(nam).document("Pacientes").set(items).addOnSuccessListener {
                        void: Void? -> Toast.makeText(this,"Successfully uploaded to the database", Toast.LENGTH_LONG).show()
                }.addOnFailureListener{
                        exception: java.lang.Exception -> Toast.makeText(this, exception.toString(), Toast.LENGTH_LONG).show()
                }
            }catch(e: Exception){
                Toast.makeText(this, e.toString(), Toast.LENGTH_LONG).show()
            }
        }else{
            Toast.makeText(this, "please full up the fields", Toast.LENGTH_LONG).show()
        }


*/
    }
}
