package com.khitjova.theendresult

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
private const val KEY = "HELLO_KEY"
class SecondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }
}