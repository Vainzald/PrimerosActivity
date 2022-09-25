package com.example.ejercicios

import android.app.Activity
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

        val formulario : Button = findViewById(R.id.btnFormulario)

        saludo.setOnClickListener {
            startActivity(empezarActividad(this,Saludar()))
        }

        contador.setOnClickListener {
            startActivity(empezarActividad(this,Contador()))
        }


        conversor.setOnClickListener {
            startActivity(empezarActividad(this,Conversor()))
        }

        formulario.setOnClickListener {
            startActivity(empezarActividad(this,EjemplosAIEP()))

        }

        salir.setOnClickListener {
            this.finish()
        }

    }
}

fun empezarActividad(activityContexto : Activity, activityEmpezar : Activity) : Intent{
    val empezarActivity = Intent(activityContexto, activityEmpezar::class.java)
    return empezarActivity

}