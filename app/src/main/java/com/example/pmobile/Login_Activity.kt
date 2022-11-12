package com.example.pmobile

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class Login_Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
    }

    fun home(view: View) {
        val intent = Intent(this, Home_Activity::class.java).apply {
        }
        startActivity(intent)
    }
}