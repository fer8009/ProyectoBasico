package com.example.fergarciaramirez.proyectobasico

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_calorias.*

class calorias : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calorias)


        botoncal.setOnClickListener {
            //recoge datos, calcula, muestra

            if (pesocal.text.isEmpty() || estaturacal.text.isEmpty() || edad.text.isEmpty()) {
                //validar radio buttons

                Toast.makeText(this, "Debes llenar todos los campos", Toast.LENGTH_SHORT).show()
            } else {

                var hombre = hombre
                var mujer = mujer
                var peso = pesocal.text.toString().toFloat()
                var estatura = estaturacal.text.toString().toFloat()
                var edad = edad.text.toString().toFloat()

                if(hombre.isChecked){
                    var cal = 665 + (13.75 * peso) + (1.85 * estatura * 100) - (4.68 * edad)
                    resultadoCalorias.setText(cal.toString())
                }
                else if(mujer.isChecked){
                    var cal = 655 + (9.6 * peso) + (5 * estatura * 100) - (6.78 * edad)
                    resultadoCalorias.setText(cal.toString())
                }
                else{
                    Toast.makeText(this,"Selecciona tu sexo",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}
