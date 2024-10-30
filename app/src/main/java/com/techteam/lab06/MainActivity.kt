package com.techteam.lab06

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.techteam.lab06.databinding.ActivityMainBinding
import com.techteam.lab06.fragments.ItemFragment

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}