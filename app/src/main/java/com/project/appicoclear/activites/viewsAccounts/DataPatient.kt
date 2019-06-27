package com.project.appicoclear.activites.viewsAccounts


import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore
import com.project.appicoclear.R
import kotlinx.android.synthetic.main.activity_data_patient.*
import java.lang.Exception

class DataPatient : AppCompatActivity() {

    lateinit var db: DocumentReference
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_patient)

    }


}
