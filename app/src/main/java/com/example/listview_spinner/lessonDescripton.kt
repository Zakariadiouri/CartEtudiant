package com.example.listview_spinner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import  android.widget.*
class LessonDetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lessonsdescription)

        val img = findViewById<ImageView>(R.id.imgLessonDetail)
        val title = findViewById<TextView>(R.id.tvTitleDetail)
        val desc = findViewById<TextView>(R.id.tvDescriptionDetail)


        val lessonTitle = intent.getStringExtra("title")
        val lessonDesc2 = intent.getStringExtra("description2")
        val lessonImage = intent.getIntExtra("imageRes", 0)

        title.text = lessonTitle
        desc.text = lessonDesc2
        img.setImageResource(lessonImage)

        //AJOUTER  Animation: Fade + Zoom + Slide Right


        val duration = 800L

        img.alpha = 0f
        img.scaleX = 0.8f
        img.scaleY = 0.8f
        img.translationX = 200f
        img.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .translationX(0f)
            .setDuration(duration)
            .start()

        title.alpha = 0f
        title.scaleX = 0.8f
        title.scaleY = 0.8f
        title.translationX = 200f
        title.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .translationX(0f)
            .setDuration(duration)
            .setStartDelay(200)
            .start()

        desc.alpha = 0f
        desc.scaleX = 0.8f
        desc.scaleY = 0.8f
        desc.translationX = 200f
        desc.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .translationX(0f)
            .setDuration(duration)
            .setStartDelay(400)
            .start()















    }
}