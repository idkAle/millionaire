package com.example.millionaireapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

private lateinit var splash: TextView

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splash = findViewById(R.id.splash)
        splash.setOnClickListener((this::moveMe))
    }

    private fun moveMe(view: View?){
        var intent= Intent(applicationContext, MainActivity::class.java)
        startActivity(intent)
    }
}