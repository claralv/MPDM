package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import com.example.parques.databinding.ActivityEditParkBinding



class EditParkActivity : ActivityWithMenus() {
    private lateinit var binding: ActivityEditParkBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityEditParkBinding.inflate(layoutInflater)
        setContentView(binding.root)

        //Cuadro de diálogo usando un Fragment:
        val miDialogo = MiDialogFragment()
        binding.btnGuardar.setOnClickListener { miDialogo.show(supportFragmentManager, "MiDialogo") }

    }
    /*
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater:MenuInflater=menuInflater
        inflater.inflate(R.menu.menu_principal,menu)
        return true
    }

    */
}

