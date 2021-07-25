package com.example.quizapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val startbutton = findViewById(R.id.button) as Button
        val aboutbutton = findViewById(R.id.button2) as Button
        val nametext = findViewById(R.id.editName) as EditText
        startbutton.setOnClickListener {
            val name = nametext.text.toString()
            val intent = Intent(applicationContext, QuestionsActivity::class.java)
            intent.putExtra("myname", name)
            startActivity(intent)
        }
        aboutbutton.setOnClickListener {
           // val intent = Intent(applicationContext, DeveloperActivity::class.java)
            startActivity(intent)
        }
    }
}
