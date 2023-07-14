package com.example.tugaslaundry

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tugaslaundry.databinding.ActivityMainBinding
import com.example.tugaslaundry.databinding.ActivityProfilBinding

import android.content.Intent
class Activity_profil : AppCompatActivity() {
    lateinit var binding: ActivityProfilBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityProfilBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        setContentView(R.layout.activity_profil)
    binding.back.setOnClickListener {
        val Intent = Intent(this, MainActivity::class.java)
        startActivity(Intent)
    }

    }

}