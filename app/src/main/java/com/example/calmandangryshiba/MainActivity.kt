package com.example.calmandangryshiba

import android.R
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.calmandangryshiba.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val calmShibImg = binding.calmShiba
        val angryShibImg = binding.angryShiba

        binding.foodButton.setOnClickListener {
            calmShibImg.visibility = View.VISIBLE
            angryShibImg.visibility = View.INVISIBLE
            val toast = Toast.makeText(this, "Happy Shiba😁", Toast.LENGTH_SHORT)
            toast.show()
        }

        binding.touchButton.setOnClickListener {
            angryShibImg.visibility = View.VISIBLE
            calmShibImg.visibility = View.INVISIBLE
            val toast = Toast.makeText(this, "Upset Shiba🙃", Toast.LENGTH_SHORT)
            toast.show()
        }

        binding.clearButton.setOnClickListener {
            angryShibImg.visibility = View.INVISIBLE
            calmShibImg.visibility = View.INVISIBLE
        }

    }
}