package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Menu
import android.view.MenuInflater
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.parques.databinding.ActivityMainBinding



class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnGuardar.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Confirmación")
                .setMessage("¿Está seguro de guardar los datos?")
                .setCancelable(false)
                .setPositiveButton(android.R.string.ok) {dialog, which ->
                    Toast.makeText(applicationContext,"Se han guardado los datos",Toast.LENGTH_SHORT).show()
                }
                .setNegativeButton(android.R.string.cancel) {dialog, which ->
                    Toast.makeText(applicationContext,"Se ha cancelado la acción",Toast.LENGTH_SHORT).show()

                }
                .show()

        }

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater:MenuInflater=menuInflater
        inflater.inflate(R.menu.menu_principal,menu)
        return true
    }


}