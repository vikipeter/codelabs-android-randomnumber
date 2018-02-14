package com.viki.randomnumberdisplay

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import java.util.*

class SecondActivity : AppCompatActivity() {

    companion object {
        val TOTAL_COUNT = "total_count"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        showRandomNumber()
    }

    fun showRandomNumber(){

        val totalCount = intent.getIntExtra(TOTAL_COUNT,0)

        val random = Random()
        var randomInt = 0

        if (totalCount > 0 ){
            randomInt = random.nextInt(totalCount + 1)
        }

        randomNumberTextView.text = randomInt.toString()
        randomHeading.text = getString(R.string.random_range_display,totalCount)
    }
}
