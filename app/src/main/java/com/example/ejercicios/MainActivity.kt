package com.example.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val saludo : Button = findViewById(R.id.btnSaludar)

        val salir : Button = findViewById(R.id.btnSalir)

        val contador : Button = findViewById(R.id.btnContador)

        val conversor : Button = findViewById(R.id.btnConversor)


        saludo.setOnClickListener {
            val intentSaludo = Intent(this, Saludar::class.java)
            this.finish()
            startActivity(intentSaludo)
        }

        contador.setOnClickListener {
            val intentContador = Intent(this, Contador::class.java)
            this.finish()
            startActivity(intentContador)
        }

        conversor.setOnClickListener {
            val intentConversor = Intent(this, Conversor::class.java)
            this.finish()
            startActivity(intentConversor)
        }

        salir.setOnClickListener {
            this.finish()
        }

    }
}