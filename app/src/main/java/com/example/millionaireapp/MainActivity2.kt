package com.example.millionaireapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast

private lateinit var moneyEarned: TextView
private lateinit var movetoNext: TextView
private lateinit var option1 : RadioButton
private lateinit var option2 : RadioButton
private lateinit var option3 : RadioButton
private lateinit var option4 : RadioButton

class MainActivity2 : AppCompatActivity() {

    private var newMoneyValue: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        option1= findViewById(R.id.Option1)
        option2= findViewById(R.id.Option2)
        option3= findViewById(R.id.Option3)
        option4= findViewById(R.id.Option4)
        moneyEarned = (findViewById(R.id.moneyEarned))

        // Get the newMoneyValue from the intent
        newMoneyValue = intent.getIntExtra("newMoneyValue", 0)
        moneyEarned.text = "You Earned: $$newMoneyValue"

        movetoNext = findViewById(R.id.submit_btn)
        movetoNext.setOnClickListener(this::toNextActivity)
        setOptions()
    }

    //    Sets the answers for the Radio button
    private fun setOptions() {
        option1.text = "Peru"
        option2.text = "Mexico"
        option3.text = "Chile"
        option4.text = "Argentina"
    }

    // Moves to the next activity and passes the value of how much money you've earned
    private fun toNextActivity(view: View?) {

        checkAnswer()

        var intent= Intent(applicationContext, MainActivity3::class.java)
        intent.putExtra("newMoneyValue", newMoneyValue)
        startActivity(intent)
    }

    //    Checks if the correct answer was picked
//    If it was the value for money earned is changed
    private fun checkAnswer() {
        if (option1.isChecked) {
            newMoneyValue = newMoneyValue + 100
            Toast.makeText(this, "This is the CORRECT answer, you earned $100", Toast.LENGTH_SHORT).show()
            moneyEarned.text = "You Earned: $$newMoneyValue"
        }
        else{
            Toast.makeText(this, "This is the WRONG answer", Toast.LENGTH_SHORT).show()
            moneyEarned.text = "You Earned: $$newMoneyValue"
        }
    }
}