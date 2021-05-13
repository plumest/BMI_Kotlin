package com.example.bmi

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.*
import androidx.core.view.isInvisible
import kotlin.math.pow

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val heightInput = findViewById<EditText>(R.id.heightInput)
        val weightInput = findViewById<EditText>(R.id.weightInput)
        val textOutput = findViewById<TextView>(R.id.textOutput)
        val button = findViewById<Button>(R.id.button)
        val imageOutput = findViewById<ImageView>(R.id.imageOutput)

        button.setOnClickListener {
            val bmi = heightInput.toString().toFloat() / 100 / (weightInput.toString().toFloat().pow(2))
            textOutput.text = bmi.toString()

            if (bmi >= 27.5) {
                imageOutput.setImageResource(R.drawable.obese)
            } else if (bmi >= 23.0) {
                imageOutput.setImageResource(R.drawable.overweight)
            } else if (bmi >= 18.5) {
                imageOutput.setImageResource(R.drawable.healthy)
            } else if (bmi > 0.0) {
                imageOutput.setImageResource(R.drawable.underweight)
            }
        }
    }
}