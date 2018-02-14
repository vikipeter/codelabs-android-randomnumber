package com.viki.randomnumberdisplay

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private var count : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun toastMe(view:View){
        val toast = Toast.makeText(this,"Hello Toast!!!",Toast.LENGTH_LONG)
        toast.show()
    }

    fun countMe(view: View){

        count = count + 1

        val countString = count.toString()

        textView.text = countString
    }

    fun randomMe(view:View){

        val randomIntent = Intent(this,SecondActivity::class.java)
        randomIntent.putExtra(SecondActivity.TOTAL_COUNT,count)
        startActivity(randomIntent)
    }

}
