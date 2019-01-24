package com.example.fergarciaramirez.proyectobasico

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_grid_layout.*
import kotlinx.android.synthetic.main.activity_imc.*

class imc : AppCompatActivity() {
    var imc=0.0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        botonimc.setOnClickListener {
            //get info, calc imc, show imc

            if(peso.text.isEmpty()){
                Toast.makeText(this,"Debes ingresar tu peso en Kg",Toast.LENGTH_SHORT).show()
            }
            else if(estatura.text.isEmpty()){
                Toast.makeText(this,"Debes ingresar tu estatura en m",Toast.LENGTH_SHORT).show()
            }
            else {
                var peso = peso.text.toString().toFloat()
                var estatura = estatura.text.toString().toFloat()
                var imc = peso / (estatura * estatura)
                resultadoIMC.setText("Tu IMC es: " + imc.toString())
                //val miPref = getSharedPreferences("pref", Context.MODE_PRIVATE)
                //val edit = miPref.edit()
                //edit.putFloat("imc,",imc)
                //edit.apply()

                val i = Intent(this,GridLayout::class.java)
                val imcf:String = "Hola"
                i.putExtra("imc",imc)
                setResult(Activity.RESULT_OK)
                finish()
            }
        }

    }





}
