package com.example.user.perfectweightdanahaburayya

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        button2.setOnClickListener {
        supportFragmentManager.beginTransaction()
                .replace(R.id.fragment,perfectWieght())
                .commit()
    }
        button.setOnClickListener {
            supportFragmentManager.beginTransaction()
                .replace(R.id.fragment,noteDialog())
                .commit()


        }
}}
