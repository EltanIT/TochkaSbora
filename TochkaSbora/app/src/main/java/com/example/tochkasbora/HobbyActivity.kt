package com.example.tochkasbora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class HobbyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hobby)
    }

    fun BackToGreeting(view: View) {
        val intent = Intent(this@HobbyActivity,GreetingActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun StartToHome(view: View) {
        val intent = Intent(this@HobbyActivity,HomePageActivity::class.java)
        startActivity(intent)
        finish()
    }
}