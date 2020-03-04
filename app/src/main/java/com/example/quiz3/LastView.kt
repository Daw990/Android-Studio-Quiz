package com.example.quiz3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class LastView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_view)

        var points = getIntent().getIntExtra("points", 0)
        var abcSummary = findViewById<TextView>(R.id.txtWynik)

        abcSummary.text = points.toString() + " / 7"
    }

    fun OnClick(view: View) {

        val intent = Intent(this, QuizStarted::class.java)
        startActivity(intent)
    }
}
