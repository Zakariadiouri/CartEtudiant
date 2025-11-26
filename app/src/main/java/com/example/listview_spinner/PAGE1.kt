package com.example.listview_spinner

import android.content.Intent
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import android.widget.*
import com.example.listview_spinner.UserData.users

class PAGE1 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.page1)

        val email = findViewById<EditText>(R.id.editEmail)
        val password = findViewById<EditText>(R.id.editPassword)
        val btn = findViewById<Button>(R.id.btnEnter)
        val goToRegister = findViewById<TextView>(R.id.signUp)
val ForgetPassword =findViewById<TextView>(R.id.tvForgetPassword)

        btn.setOnClickListener {
            val emailInput = email.text.toString()
            val passInput = password.text.toString()

            val user = users.find { it.email == emailInput && it.password == passInput }

            if (user != null) {
                Toast.makeText(this, "login successful", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
            } else {
                Toast.makeText(this, "login failed", Toast.LENGTH_SHORT).show()
            }
        }


        goToRegister.setOnClickListener {
            val intent = Intent(this, rogisterAtivity::class.java)
            startActivity(intent)
        }
        ForgetPassword.setOnClickListener{
            val intent = Intent(this, forget::class.java)
            startActivity(intent)


        }


        val duration = 800L




        goToRegister.alpha = 0f
        goToRegister.alpha = 0f
        goToRegister.scaleX = 0.8f
        goToRegister.scaleY = 0.8f
        goToRegister.translationX = 200f
        goToRegister.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .translationX(0f)
            .setDuration(duration)
            .start()
       email.alpha = 0f
        email.scaleX = 0.8f
        email.scaleY = 0.8f
        email.translationX = 200f
        email.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .translationX(0f)
            .setDuration(duration)
            .start()

        password.alpha = 0f
        password.scaleX = 0.8f
        password.scaleY = 0.8f
        password.translationX = 200f
        password.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .translationX(0f)
            .setDuration(duration)
            .setStartDelay(200)
            .start()

        btn.alpha = 0f
        btn.scaleX = 0.8f
        btn.scaleY = 0.8f
        btn.translationX = 200f
        btn.animate()
            .alpha(1f)
            .scaleX(1f)
            .scaleY(1f)
            .translationX(0f)
            .setDuration(duration)
            .setStartDelay(400)
            .start()

    }
}