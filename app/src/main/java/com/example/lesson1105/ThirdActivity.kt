package com.example.lesson1105

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        Toast.makeText(this, "Добро пожаловать на третью страничку",
            Toast.LENGTH_SHORT).show()
    }
}