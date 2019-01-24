package com.example.fergarciaramirez.proyectobasico

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_grid_layout.*
import java.io.FileNotFoundException
import java.io.IOException
import android.preference.PreferenceManager
import android.content.SharedPreferences
import android.speech.RecognizerIntent
import android.widget.Toast


class GridLayout : AppCompatActivity() {
    companion object {
        private val GRABAR_CODE=123
    }

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_grid_layout)


      //  val sharedPref = PreferenceManager.getDefaultSharedPreferences(this)
      //  val imc = sharedPref.getString("imc", "")
      //  if(imc!=""){
      //      lastimc.setText("@string/lasimc"+imc.toString())


        calcuIMC.setOnClickListener {
            var ib = Intent(this, imc::class.java)
            startActivityForResult(ib,1)
        }

        piramide.setOnClickListener {
            var i1 = Intent(this, com.example.fergarciaramirez.proyectobasico.piramide::class.java)
            startActivity(i1)
        }

        calcuCal.setOnClickListener {
            var i = Intent(this, calorias::class.java)
            startActivity(i)

        }

        recetas.setOnClickListener {
            var i = Intent(this, com.example.fergarciaramirez.proyectobasico.recetas::class.java)
            startActivity(i)
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        if(requestCode==1){
            if(resultCode == RESULT_OK){
                var imcstr = data?.getFloatExtra("imc", 0F)
                //Me manda un valor nulo siempre :(

                Toast.makeText(this,"$imcstr",Toast.LENGTH_SHORT).show()
                lastimc.text = imcstr.toString()
            }
        }
    }




}
