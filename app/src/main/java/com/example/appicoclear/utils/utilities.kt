package com.example.appicoclear.utils

import android.content.Context
import android.content.Intent
import com.example.appicoclear.HomeUser

fun Context.action(){
    val intent = Intent(this, HomeUser::class.java).apply {
        flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK }
    startActivity(intent)
}