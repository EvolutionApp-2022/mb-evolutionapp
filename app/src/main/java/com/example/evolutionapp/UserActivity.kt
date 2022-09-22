package com.example.evolutionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val btnAlumno: Button = findViewById(R.id.btnUserAlumno)
        val btnDocente: Button = findViewById(R.id.btnUserDocente)


        btnAlumno.setOnClickListener(){
            startActivity(Intent(this, HomeStudentActivity::class.java))
        }
    }
}