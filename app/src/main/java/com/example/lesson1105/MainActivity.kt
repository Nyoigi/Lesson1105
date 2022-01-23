package com.example.lesson1105

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnNavigation.setOnClickListener{
            val textNav = etNavigation.text.toString()
            when (textNav){
                "Second" -> navActivity(SecondActivity())
                "Third" -> navActivity(ThirdActivity())
                else -> Toast.makeText(this, "Данного окна не существует",
                    Toast.LENGTH_SHORT).show()
            }
        }
    }

    private fun navActivity(activity: Activity){
        val intent = Intent(this, activity::class.java)
        startActivity(intent)
        overridePendingTransition(0,0)
    }
//    Toast.makeText(this, "Данного окна не существует", Toast.LENGTH_SHORT).show()
//    private fun navigateTo(activity: Activity){
//        val intent = Intent(this, activity::class.java)
//        startActivity(intent)
//        overridePendingTransition(0,0)
//    }
}