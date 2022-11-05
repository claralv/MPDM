package com.example.parques

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.listadoparques.ParqueProvider
import com.example.listadoparques.adapter.ParqueAdapter
import com.example.parques.databinding.ActivityMainBinding

class MainActivity : ActivityWithMenus() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recycler.layoutManager= LinearLayoutManager(this)
        binding.recycler.adapter= ParqueAdapter(ParqueProvider.listaparque)
    }
}
