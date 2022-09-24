package com.example.ejercicios

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Contador : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contador)

        val activar = findViewById<Button>(R.id.btnActivar)
        val atras = findViewById<Button>(R.id.btnBack)
        val reiniciar = findViewById<Button>(R.id.btnReiniciar)
        var contados = findViewById<TextView>(R.id.tvwContados)

        var numeros = 0

        activar.setOnClickListener {
            numeros +=1

            contados.text = numeros.toString()
        }

        reiniciar.setOnClickListener {
            numeros = 0
            contados.text = numeros.toString()
        }

        atras.setOnClickListener {
            val intentMenuPrincipal = Intent(this, MainActivity::class.java)
            this.finish()
            startActivity(intentMenuPrincipal)

        }
    }
}