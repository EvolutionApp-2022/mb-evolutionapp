package com.example.evolutionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnLogin: Button = findViewById(R.id.btnLogin)
        val btnSignup: Button = findViewById(R.id.btnSignup)

        btnLogin.setOnClickListener()
        {
            startActivity(Intent(this, LoginActivity::class.java))
        }

        btnSignup.setOnClickListener()
        {
            startActivity(Intent(this, SignupActivity::class.java))
        }
    }
}