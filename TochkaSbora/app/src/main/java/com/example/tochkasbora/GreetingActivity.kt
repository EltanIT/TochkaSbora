package com.example.tochkasbora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class GreetingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_greeting)

    }


    fun Continue(view: View) {
        val intent = Intent(this@GreetingActivity,HobbyActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun BackToRegistrate(view: View) {
        val intent = Intent(this@GreetingActivity, RegistrationActivity::class.java)
        startActivity(intent)
        finish()
    }


}