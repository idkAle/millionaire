package com.example.millionaireapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

private lateinit var moneyEarned: TextView

class ResultActivity : AppCompatActivity() {

    private var newMoneyValue: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        moneyEarned = (findViewById(R.id.moneyEarned))
        newMoneyValue = intent.getIntExtra("newMoneyValue", 0)
        moneyEarned.text = "Congrats You Earned $$newMoneyValue"
    }
}