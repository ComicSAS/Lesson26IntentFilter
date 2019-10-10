package com.example.lesson26intentfilter

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_date.*
import java.text.SimpleDateFormat

class ActivityDateEx : AppCompatActivity() {

    @SuppressLint("SimpleDateFormat")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_date)

        val sdf = SimpleDateFormat("EEE, MMM d, yyyy")
        val date = sdf.format(System.currentTimeMillis())

        tvDate.text = date
    }
}
