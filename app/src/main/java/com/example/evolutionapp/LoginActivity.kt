package com.example.evolutionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val loginEmail: EditText = findViewById(R.id.loginEmail)
        val loginPass: EditText = findViewById(R.id.loginPass)
        val btnLogin: Button = findViewById(R.id.btnLogin1)
        btnLogin.setOnClickListener(){
            checkNotBlank(loginEmail, loginPass)
        }
    }

    private fun checkNotBlank(email: EditText, pass: EditText){
        if(email.text.isNotEmpty() and pass.text.isNotEmpty()){
            startActivity(Intent(this, HomeStudentActivity::class.java))
        }
        else{
            showErrorText()
        }
    }
    private fun showErrorText(){
        Toast.makeText(this, "Faltan completar campos!", Toast.LENGTH_SHORT).show()
    }
}