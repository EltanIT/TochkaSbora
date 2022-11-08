package com.example.tochkasbora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class RegistrationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registration)

    }

    fun StartToEnter(view: View) {
        val intent = Intent(this@RegistrationActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun StartToRegistrate(view: View) {
        val intent = Intent(this@RegistrationActivity, GreetingActivity::class.java)
        startActivity(intent)
        finish()
    }
}