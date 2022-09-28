package com.example.evolutionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton

class StudentProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_profile)

        val btnArrowback: ImageButton = findViewById(R.id.btnArrowback)
        val btnProfile: Button = findViewById(R.id.btnChangeImage)
        val btnLogOut: Button = findViewById(R.id.btnLogOut)

        btnArrowback.setOnClickListener(){
            startActivity(Intent(this, HomeStudentActivity::class.java))
        }

        btnLogOut.setOnClickListener(){
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}