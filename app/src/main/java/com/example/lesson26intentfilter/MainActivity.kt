package com.example.lesson26intentfilter

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onClick(v: View?) {
        when (v!!.id) {
            R.id.btnTime -> {
                intent = Intent("com.example.intent.action.showtime")
                startActivity(intent)
            }
            R.id.btnDate -> {
                intent = Intent("com.example.intent.action.showdate")
                startActivity(intent)
            }
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btnTime.setOnClickListener(this)
        btnDate.setOnClickListener(this)
    }
}
