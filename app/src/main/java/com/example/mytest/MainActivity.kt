package com.example.mytest

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("show_lg10_git", "onCreate:token one")

        Log.d("show_lg10_git", "onCreate: AA")

        Log.d("show_lg10_my_test", "onCreate: test")

        Log.e("show_lg10_first", "onCreate: m t f")
    }
}