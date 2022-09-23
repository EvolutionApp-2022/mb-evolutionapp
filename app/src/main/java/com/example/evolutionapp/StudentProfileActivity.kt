package com.example.evolutionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class StudentProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student_profile)

        val btnArrowback: ImageButton = findViewById(R.id.btnArrowback)

        btnArrowback.setOnClickListener(){
            startActivity(Intent(this, HomeStudentActivity::class.java))
        }
    }
}