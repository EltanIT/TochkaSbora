package com.example.tochkasbora

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import java.util.concurrent.TimeUnit

class SplashScreenActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        TimeUnit.SECONDS.sleep(1)
        val intent = Intent(this@SplashScreenActivity, RegistrationActivity::class.java)
        startActivity(intent)
        finish()
    }
}