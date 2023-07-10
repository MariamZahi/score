package com.example.scoreevents

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private var team1Score = 0
    private var team2Score = 0
    private var changeAmount = 1
//to initialise after value provided
    private lateinit var team1ScoreTextView: TextView
    private lateinit var team2ScoreTextView: TextView
    private lateinit var changeAmountEditText: EditText

    //Introduce buttons

    val increaseTeam1Button: Button = findViewById(R.id.increaseTeam1Button)
    val decreaseTeam1Button: Button = findViewById(R.id.decreaseTeam1Button)
    val increaseTeam2Button: Button = findViewById(R.id.increaseTeam2Button)
    val decreaseTeam2Button: Button = findViewById(R.id.decreaseTeam2Button)
    val changeAmountButton: Button = findViewById(R.id.changeAmountButton)

    increaseTeam1Button.setOnClickListener {
        team1Score += changeAmount
        updateScores()
    }