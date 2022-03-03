package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var pizza: CheckBox
    lateinit var frytki: CheckBox
    lateinit var burger: CheckBox
    lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        pizza = findViewById(R.id.checkBox)
        frytki = findViewById(R.id.checkBox2)
        burger = findViewById(R.id.checkBox3)
        button = findViewById(R.id.button)
        button.setOnClickListener {
            var totalAmount: Int = 0
            val result = StringBuilder()
            result.append("Wybrane produkty")
            if (pizza.isChecked) {
                result.append("\nPizza 2PLN")
                totalAmount += 2
            }
            if (frytki.isChecked) {
                result.append("\nFrytki 10PLN")
                totalAmount += 10
            }
            if (burger.isChecked) {
                result.append("\nBurger 420PLN")
                totalAmount += 420
            }
            result.append("\nTotal: " + totalAmount + "PLN")
            Toast.makeText(applicationContext, result.toString(), Toast.LENGTH_SHORT).show()
        }
    }
}