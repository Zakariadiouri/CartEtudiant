package com.example.listview_spinner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import kotlin.jvm.java
class HomeActivity : AppCompatActivity() {

    val subjects = arrayOf("Math", "Physics", "English","HISTORY")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        val spinner = findViewById<Spinner>(R.id.spSubjects)
        val btnSelect = findViewById<Button>(R.id.btnSelect)

        val adapter = ArrayAdapter(this, android.R.layout.simple_spinner_item, subjects)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinner.adapter = adapter
        btnSelect.setOnClickListener {
            val subject = spinner.selectedItem.toString()
            val intent = Intent(this, LessonsActivity::class.java)
            intent.putExtra("subject", subject)
            startActivity(intent)
        }

        val duration = 800L

        spinner.alpha = 0f
       spinner.scaleX = 0.8f
        spinner.scaleY = 0.8f
        spinner.translationX = 200f
       spinner.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .translationX(0f)
            .setDuration(duration)
            .start()

btnSelect.alpha = 0f
        btnSelect.scaleX = 0.8f
        btnSelect.scaleY = 0.8f
        btnSelect.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .translationX(0f)
            .setDuration(duration)
            .start()

        }

    }
