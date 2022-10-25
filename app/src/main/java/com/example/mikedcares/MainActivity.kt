package com.example.mikedcares

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.mikedcares.databinding.ActivityMainBinding
import com.example.mikedcares.ui.slider.SliderActivity


class MainActivity : Activity() {
    // bind views
    private lateinit var binding: ActivityMainBinding
    private lateinit var container : FrameLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // init container
        container = binding.container


        // show for new users
        val intent = Intent(this, SliderActivity::class.java)
        startActivity(intent)
        finish()
    }
}






