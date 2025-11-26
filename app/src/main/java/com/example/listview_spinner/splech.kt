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
            setContentView(R.layout.splach) // Ensure this layout file exists and is named correctly

            Handler(Looper.getMainLooper()).postDelayed({
                prefs.edit().putBoolean("isFirstRun", false).apply()

                val intent = Intent(this, PAGE1::class.java)
                startActivity(intent)
                finish()
            }, 2000)
        } else {
            startActivity(Intent(this, PAGE1::class.java))
            finish()
        }
    }
}
