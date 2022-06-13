package com.derrick.projectagecalc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClickEvent(view: View){
        val DOB = findViewById<EditText>(R.id.etDOB)
        val showAge = findViewById<TextView>(R.id.tvShowAge)
        val userDOB:String = DOB.text.toString() //something about having to convert back to the originally declared datatype

        if(userDOB.toInt() == 0){
            showAge.text = "Invalid input."
            return
        }
        
        val year:Int = Calendar.getInstance().get(Calendar.YEAR)
        val myAge = year - userDOB.toInt()
        showAge.text = "Your age is $myAge"
    }
}