package com.example.studentsmarksgenerator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {
    private lateinit var text1 :TextView
    private lateinit var text2: TextView
    private lateinit var  text3 :TextView
    private lateinit var text4 :TextView
    private lateinit var text5 :TextView
    private lateinit var btn:Button

    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text1=findViewById(R.id.studentid)
        text2=findViewById(R.id.name)
        text3=findViewById(R.id.marksP)
        text4=findViewById(R.id.marksA)
        text5=findViewById(R.id.Iotmarks)
        btn=findViewById(R.id.addtolist)
    }

    fun Onclick (v: View) {

        var studentname=text1.text.toString()
         var studentid=text2.text.toString()
          val studentamarks=text3.text.toString().toIntOrNull()
            val studentmarksp=text4.text.toString().toIntOrNull()
            val studentmarksiot=text5.text.toString().toIntOrNull()
            Toast.makeText(this,"Your results will be published $studentid",Toast.LENGTH_SHORT).show()
                text1.setText("")
                text2.setText("")
            text3.setText("")
            text4.setText("")
            text5.setText("")

            val intent = Intent(
                  this@MainActivity,ResultActivity::class.java

            )
            intent.putExtra("text1",studentid)
            intent.putExtra("text2",studentname)
            intent.putExtra("text3",studentamarks)
            intent.putExtra("text4",studentmarksp)
            intent.putExtra("text5",studentmarksiot)
            startActivity(intent)


    }


    }



