package com.example.madventure

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import com.example.madventure.databinding.ActivityMainBinding

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SignInClick(view: android.view.View) {
        startActivity(Intent(this, SignInActivity::class.java))
        finish()
    }
}