package com.example.listview_spinner

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

import com.example.listview_spinner.UserData.users

class forget : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.forgetpass)

        val emailInput = findViewById<EditText>(R.id.editEmailForget)
        val btnRecover = findViewById<Button>(R.id.btnRecover)

        btnRecover.setOnClickListener {
            val email = emailInput.text.toString()

            val user = users.find { it.email == email }

            if (user != null) {


            } else {
                Toast.makeText(this, "faild email not found", Toast.LENGTH_SHORT).show()
            }
        }
    }
}