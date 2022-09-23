package com.example.evolutionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

class HomeStudentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_student)

        val btnProfile: ImageButton = findViewById(R.id.btnProfile)

        btnProfile.setOnClickListener(){
            startActivity(Intent(this, StudentProfileActivity::class.java))
        }
    }
}