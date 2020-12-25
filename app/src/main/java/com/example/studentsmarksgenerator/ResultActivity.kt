package com.example.studentsmarksgenerator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class ResultActivity : AppCompatActivity() {
    private lateinit var text1:TextView
    private lateinit var text2:TextView
    private lateinit var text3:TextView
    private lateinit var text4:TextView
    private lateinit var text5:TextView
    private lateinit var text6:TextView




    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)
        text1=findViewById(R.id.name)
        text2=findViewById(R.id.secondperc)
        text3=findViewById(R.id.thridperc)
        text4=findViewById(R.id.androidfirst)
        text5=findViewById(R.id.androidsecond)
        text6=findViewById(R.id.androidthrid)

        val intent = intent
        if (intent.extras!=null){
            val studentname= intent.getStringExtra("text1")
            val studentid=intent.getStringExtra("text2")
           val studentmarks=intent.getIntExtra("text3",0)
            val studentmarksp=intent.getIntExtra("text4",0)
            val studentmarksiot=intent.getIntExtra("text5",0)
            val add = studentmarks+studentmarksp+studentmarksiot
            val perc = add/3
            if (perc<=40){
                text1.setText("$studentname your percentage is$perc% you have failed ")
            }
             if (perc<=60){
                 text1.setText("$studentname your percentage is$perc% Second Division ")
            }
            if (perc>=70)
            text1.setText("$studentname your percentage is$perc% First Division")


        }

        fun calcutae(){

        }
    }
}