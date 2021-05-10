package com.example.listviewapp

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import com.example.listviewapp.adapter.ListAdapter
import com.example.listviewapp.data.Datasource
import com.example.listviewapp.databinding.ActivityMainBinding
import com.example.listviewapp.model.FunFact

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        val adapter = ListAdapter(this, Datasource.loadFunFacts())
        binding.listView.adapter = adapter

    }

}