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

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        team1ScoreTextView = findViewById(R.id.team1ScoreLabel)
        team2ScoreTextView = findViewById(R.id.team2ScoreLabel)
        changeAmountEditText = findViewById(R.id.changeAmountEditText)

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
        decreaseTeam1Button.setOnClickListener {
            team1Score -= changeAmount
            if (team1Score < 0) {
                team1Score = 0
            }
            updateScores()
        }

        increaseTeam2Button.setOnClickListener {
            team2Score += changeAmount
            updateScores()
        }

        decreaseTeam2Button.setOnClickListener {
            team2Score -= changeAmount
            if (team2Score < 0) {
                team2Score = 0
            }
            updateScores()
        }

        changeAmountButton.setOnClickListener {
            val amountString = changeAmountEditText.text.toString()
            if (amountString.isEmpty()) {
                changeAmount = amountString.toInt()
            }
        }
    }
    private fun updateScores() {
        team1ScoreTextView.text = "Team 1 Score: $team1Score"
        team2ScoreTextView.text = "Team 2 Score: $team2Score"
    }
}