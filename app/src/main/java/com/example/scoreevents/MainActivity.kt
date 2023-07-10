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