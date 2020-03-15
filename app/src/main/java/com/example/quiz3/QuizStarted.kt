package com.example.quiz3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.RadioButton
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_quiz_started.*

class QuizStarted : AppCompatActivity() {

    var questionsList = AllQuestions()
    
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_started)

        questionsList.makeQuestionsEasy()
        questionsList.makeQuestionsMedium()
        questionsList.makeQuestionsHard()

        val qEasy1 = questionsList.questionsList_Easy.get(questionsList.randomNumberQuestionEasy())
        val qMedium1 = questionsList.questionsList_Medium.get(questionsList.randomNumberQuestionMedium())
        val qHard1 = questionsList.questionsList_Hard.get(questionsList.randomNumberQuestionHard())

        txtQuestion1.setText(qEasy1.question)
        radioButton1q1.setText(qEasy1.q_Odp1)
        radioButton2q1_true.setText(qEasy1.q_Thrue)
        radioButton3q1.setText(qEasy1.q_Odp2)

        txtQuestion2.setText(qMedium1.question)
        radioButton1q2.setText(qMedium1.q_Odp1)
        radioButton2q2.setText(qMedium1.q_Odp2)
        radioButton3q2_true.setText(qMedium1.q_Thrue)

        txtQuestion3.setText(qHard1.question)
        radioButton1q3.setText(qHard1.q_Odp1)
        radioButton2q3_true.setText(qHard1.q_Thrue)
        radioButton3q3.setText(qHard1.q_Odp2)
    }

    fun OnClick(view: View) {

        questionsList.points = 0

        if(radioButton2q1_true.isChecked || radioButton1q1.isChecked || radioButton3q1.isChecked &&
            radioButton1q2.isChecked || radioButton2q2.isChecked || radioButton3q2_true.isChecked &&
            radioButton1q3.isChecked || radioButton2q3_true.isChecked || radioButton3q3.isChecked) {

            if (radioButton2q1_true.isChecked) {
                questionsList.addPoints(1)
            }
            if (radioButton3q2_true.isChecked) {
                questionsList.addPoints(2)
            }
            if (radioButton2q3_true.isChecked) {
                questionsList.addPoints(3)
            }

            val intent = Intent(applicationContext, LastView::class.java)
            intent.putExtra("points", questionsList.points)
            startActivity(intent)
        }else{
            Toast.makeText(applicationContext, "Proszę zaznazyć odpowiedź!", Toast.LENGTH_LONG).show()
        }
    }
}
