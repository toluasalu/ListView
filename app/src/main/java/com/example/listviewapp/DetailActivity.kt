package com.example.listviewapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import com.example.listviewapp.adapter.ListAdapter.Companion.DETAIL_EXTRA
import com.example.listviewapp.adapter.ListAdapter.Companion.LOGO_EXTRA
import com.example.listviewapp.adapter.ListAdapter.Companion.NAME_EXTRA
import com.example.listviewapp.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        // Get the Intent that started this activity and extract the string
        val name = intent.getStringExtra(NAME_EXTRA)
        val details = intent.getStringExtra(DETAIL_EXTRA)
        val logo = intent.getIntExtra(LOGO_EXTRA, 0)

        val detailTextView = findViewById<TextView>(R.id.description).apply {
            text = details
        }

        val logoImageView = findViewById<ImageView>(R.id.logo).apply {
            setImageResource(logo)
        }

        title = name
    }
}