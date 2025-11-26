package com.example.listview_spinner

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val prefs = getSharedPreferences("appPrefs", MODE_PRIVATE)
        val isFirstRun = prefs.getBoolean("isFirstRun", true)

        if (isFirstRun) {
            setContentView(R.layout.splach)

            Handler(Looper.getMainLooper()).postDelayed({
                prefs.edit().putBoolean("isFirstRun", false).apply()
                startActivity(Intent(this, PAGE1::class.java))
                finish()
            }, 2000)

        } else {
            startActivity(Intent(this, PAGE1::class.java))
            finish()
        }
    }
}
