package com.example.evolutionapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signup)
        val nombre: EditText = findViewById(R.id.signupNombre)
        val apellido: EditText = findViewById(R.id.signupApellido)
        val email: EditText = findViewById(R.id.signupEmail)
        val password: EditText = findViewById(R.id.signupPass)
        val institucion: EditText = findViewById(R.id.signupInstitucion)
        val button: Button = findViewById(R.id.btnSignup)

        button.setOnClickListener{ checkNotBlank(nombre, apellido, email, password, institucion) }
    }

    private fun checkNotBlank(nombre:EditText, apellido:EditText, email:EditText, password:EditText, institucion:EditText){
        if(nombre.text.isNotEmpty() and apellido.text.isNotEmpty() and email.text.isNotEmpty()
            and password.text.isNotEmpty() and institucion.text.isNotEmpty()){

            startActivity(Intent(this, UserActivity::class.java))

        }
        else{
            showErrorText()
        }
    }
    private fun showErrorText(){
        Toast.makeText(this, "Faltan completar algunos campos!", Toast.LENGTH_SHORT).show()
    }
}