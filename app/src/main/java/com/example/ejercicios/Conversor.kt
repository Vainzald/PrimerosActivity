package com.example.ejercicios

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.chip.ChipGroup
import java.text.DecimalFormat

class Conversor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conversor)

        val cantidad = findViewById<EditText>(R.id.txCantidad)

        val conversor = findViewById<Button>(R.id.btnConvertir)
        val mensaje = findViewById<TextView>(R.id.tvwResultado)

        val atras = findViewById<Button>(R.id.btnAtrasCon)
        val CLP = findViewById<RadioButton>(R.id.rbtnCLP)

        val USD = findViewById<RadioButton>(R.id.rbtnUSD)




        conversor.setOnClickListener {
            var resulado : Double? = 0.0
            var texto : String?= "No se ha dado cantidad"
//            val mensaje = Toast.makeText(this, "Cantidad es ${finalResultado} USD", Toast.LENGTH_SHORT)
            if (USD.isChecked){
                resulado = pesos_a_dolares(cantidad)
                texto = "${String.format("%.4f",resulado)} USD"
            }
            else if(CLP.isChecked){
                resulado = dolares_a_pesos(cantidad)
                texto = "${String.format("%.4f",resulado)} CLP"
                cantidad.hint = "USD"

            }else{
                cantidad.hint="Seleccione metodo"
            }

            mensaje.text = texto
//            mensaje.show()
        }

        atras.setOnClickListener {
            val intentMenuPrincipal = Intent(this, MainActivity::class.java)
            this.finish()
            startActivity(intentMenuPrincipal)

        }

    }
}

    fun pesos_a_dolares(cantidad : EditText): Double?{
        val n1 : Double = cantidad.text.toString().toDouble()

        val resultado : Double = n1 / 880
        return resultado
    }

    fun dolares_a_pesos(cantidad : EditText): Double?{
        val n1 : Double = cantidad.text.toString().toDouble()

        val resultado : Double = n1 * 930
        return resultado
    }
