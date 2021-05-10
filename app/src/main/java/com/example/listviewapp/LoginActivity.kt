package com.example.listviewapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.textfield.TextInputEditText

class LoginActivity:AppCompatActivity() {
    private val loginButton: Button
      get() = findViewById(R.id.button)

    private val emailInput:TextInputEditText
       get() = findViewById(R.id.email_input)

    private val passwordInput:TextInputEditText
      get() = findViewById(R.id.password_input)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        //click listener for button
        loginButton.setOnClickListener {
        val emailAddress =  emailInput.text.toString()
        val password = passwordInput.text.toString()
        if(emailAddress == "johnasalu13@gmail.com" && password == "123456"){
            val intent = Intent(this, MainActivity::class.java)
             startActivity(intent)
        }

        }
    }


}