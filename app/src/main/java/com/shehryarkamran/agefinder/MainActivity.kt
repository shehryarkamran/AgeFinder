package com.shehryarkamran.agefinder

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun btn_listener(view: View){
        val userDOB:String = editText.text.toString()
        if (userDOB.toInt() == 0) {
            textView.text = "Invalid input"
            return
        }
        val year:Int = Calendar.getInstance().get(Calendar.YEAR)
        val myage = year - userDOB.toInt()
        textView.text = "Your Age is $myage years"
    }
}