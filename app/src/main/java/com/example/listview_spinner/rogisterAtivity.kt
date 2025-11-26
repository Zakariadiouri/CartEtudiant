package com.example.listview_spinner

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.*

class rogisterAtivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rogister)

        val name = findViewById<EditText>(R.id.FullName)
        val email = findViewById<EditText>(R.id.etEmail)
        val password = findViewById<EditText>(R.id.etPassword)
        val rgLevel = findViewById<RadioGroup>(R.id.rgLevel)
        val cbRules = findViewById<CheckBox>(R.id.cheeck)
        val btnRegister = findViewById<Button>(R.id.btnRegister)

        btnRegister.setOnClickListener {

            val n = name.text.toString().trim()
            val e = email.text.toString().trim()
            val p = password.text.toString().trim()

            if (n.isEmpty() || e.isEmpty() || p.isEmpty()) {
                Toast.makeText(this, "All fields are required", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val selectedId = rgLevel.checkedRadioButtonId
            if (selectedId == -1) {
                Toast.makeText(this, "Please choose your level", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val level = findViewById<RadioButton>(selectedId).text.toString()

            if (!cbRules.isChecked) {
                Toast.makeText(this, "You must accept the rules!", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val newUser = user(
                name = n,
                email = e,
                password = p,
                level = level,
                accept = true
            )

            UserData.users.add(newUser)

            Toast.makeText(this, "User registered successfully!", Toast.LENGTH_SHORT).show()


            name.text.clear()
            email.text.clear()
            password.text.clear()
            rgLevel.clearCheck()
            cbRules.isChecked = false

            val intent = Intent(this, PAGE1::class.java)
            startActivity(intent)

            finish()
        }
    }
}
