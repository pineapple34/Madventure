package com.example.madventure

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.util.Patterns

class SignInActivity : Activity() {
    lateinit var email: EditText
    lateinit var password: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        email = findViewById(R.id.email_text)
        password = findViewById(R.id.password_text)
    }

    fun sign_in(view: android.view.View) {
        if (email.text.isNotEmpty() && password.text.isNotEmpty() && Patterns.EMAIL_ADDRESS.matcher(email.text).matches()){
            startActivity(Intent(this, ResultActivity::class.java))
            finish()
        }
    }
}