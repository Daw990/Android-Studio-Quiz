package com.example.quiz3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.RadioButton
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz_started.*

import java.util.Random
import kotlin.reflect.typeOf

class QuizStarted : AppCompatActivity() {

    var points = Questions()
    var Lista1pkt = ArrayList<model>()

    
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_started)
    }

    fun OnClick(view: View) {

        if(radioButton2q1_true.isChecked || radioButton1q1.isChecked || radioButton3q1.isChecked &&
            radioButton1q2.isChecked || radioButton2q2.isChecked || radioButton3q2_true.isChecked &&
            radioButton1q3.isChecked || radioButton2q3_true.isChecked || radioButton3q3.isChecked) {

            if (findViewById<RadioButton>(RG_q1.checkedRadioButtonId).text == "Wisła") {
                points.addPoints(2)
            }
            if (findViewById<RadioButton>(RG_q2.checkedRadioButtonId).text == "1939") {
                points.addPoints(1)
            }
            if (findViewById<RadioButton>(RG_q3.checkedRadioButtonId).text == "trzecią") {
                points.addPoints(4)
            }

            val intent = Intent(applicationContext, LastView::class.java)
            intent.putExtra("points", points.points)
            startActivity(intent)
        }else{
            Toast.makeText(applicationContext, "Proszę zaznazyć odpowiedź!", Toast.LENGTH_LONG).show()
        }
    }
}
