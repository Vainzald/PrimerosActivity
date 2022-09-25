package com.example.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class Saludar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saludar)

        val saludo : Button = findViewById(R.id.btnSaludo)

        val atras : Button = findViewById(R.id.btnAtras)

        saludo.setOnClickListener {
            val mensajeSaludo = Toast.makeText(this,"Bienvenido", Toast.LENGTH_SHORT)
            mensajeSaludo.show()
        }

        atras.setOnClickListener {
            this.finish()
        }
    }
}