package com.example.quiz3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_last_view.*

class LastView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_last_view)

        var points = getIntent().getIntExtra("points", 0)

        txtWynik.setText(points.toString() + " / 6")

    }

    fun OnClick(view: View) {

        val intent = Intent(this, QuizStarted::class.java)
        startActivity(intent)

    }
}
