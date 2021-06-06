package com.example.calculator

import android.icu.text.NumberingSystem
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var tvNumbers = findViewById<TextView>(R.id.tvNumbers)
        var tvNumbers2 = findViewById<TextView>(R.id.tvNumbers2)
        var btnAdd = findViewById<Button>(R.id.btnAdd)
        var btnDivide = findViewById<Button>(R.id.btnDivide)
        var btnMultiply = findViewById<Button>(R.id.btnMultiply)
        var btnSubtract = findViewById<Button>(R.id.btnSubtract)
        var tvResults=findViewById<TextView>(R.id.tvResults)
        btnAdd.setOnClickListener {
            var Numbers = tvNumbers.text.toString().toInt()
            var Numbers2 = tvNumbers2.text.toString().toInt()
            var Results = Numbers + Numbers2
            tvResults.text="Results $Results"


        }
        btnDivide.setOnClickListener {
            var Numbers = tvNumbers.text.toString().toInt()
            var Numbers2 = tvNumbers2.text.toString().toInt()
            var  Results= Numbers / Numbers2
            tvResults.text="Results $Results"


        }
        btnMultiply.setOnClickListener {
            var Numbers = tvNumbers.text.toString().toInt()
            var Numbers2 = tvNumbers2.text.toString().toInt()
            var Results = Numbers* Numbers2
            tvResults.text="Results $Results"

        }
        btnSubtract.setOnClickListener {
            var Numbers = tvNumbers.text.toString().toInt()
            var Numbers2 = tvNumbers2.text.toString().toInt()
            var Results = Numbers - Numbers2
            tvResults.text="Results $Results"

        }
    }
}