package com.example.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class EjemplosAIEP : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejemplos_aiep)

        val enviar : Button = findViewById(R.id.btnRegistrarse)

        enviar.setOnClickListener {
            this.finish()
        }
    }
}