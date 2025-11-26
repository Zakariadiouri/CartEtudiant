package com.example.listview_spinner





data class user(
    val name: String,
    val email: String,
    val password: String,
    val level: String,
    val accept: Boolean
)

object UserData {
    val users = mutableListOf<user>()
}
