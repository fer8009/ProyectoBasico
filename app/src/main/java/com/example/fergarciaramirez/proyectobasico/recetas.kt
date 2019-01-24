package com.example.fergarciaramirez.proyectobasico

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_recetas.*
import android.content.Intent
import android.net.Uri


class recetas : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recetas)

        desayunos.setOnClickListener{
            //mandar a desayunos
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.objetivobienestar.com/desayunos_40_119.html"))
            val browserChooserIntent = Intent.createChooser(browserIntent, "Choose browser of your choice")
            startActivity(browserChooserIntent)
        }

        comidas.setOnClickListener{
            //mandar a desayunos
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.objetivobienestar.com/recetas-sanas_122_119.html"))
            val browserChooserIntent = Intent.createChooser(browserIntent, "Choose browser of your choice")
            startActivity(browserChooserIntent)
        }

        cenas.setOnClickListener{
            //mandar a desayunos
            val browserIntent = Intent(Intent.ACTION_VIEW, Uri.parse("http://www.objetivobienestar.com/cenas-saludables-en-10-minutos_11707_102.html"))
            val browserChooserIntent = Intent.createChooser(browserIntent, "Choose browser of your choice")
            startActivity(browserChooserIntent)
        }

    }
}
