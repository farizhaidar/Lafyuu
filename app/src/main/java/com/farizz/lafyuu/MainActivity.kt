package com.farizz.lafyuu

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSignIn = findViewById<Button>(R.id.btnSignIn)
        val btnGoogleSignIn = findViewById<Button>(R.id.btnGoogleSignIn)
        val btnFacebookSignIn = findViewById<Button>(R.id.btnFacebookSignIn)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val forgotPassword = findViewById<TextView>(R.id.tvForgotPassword)
        val register = findViewById<TextView>(R.id.tvRegister)

        btnSignIn.setOnClickListener {
            val email = etEmail.text.toString()
            val password = etPassword.text.toString()

            if (email == "admin" && password == "admin") {
                // Correct credentials, navigate to HomeActivity
                val intent = Intent(this, HomeActivity::class.java)
                startActivity(intent)
                finish() // Optional: finish the MainActivity if you don't want to allow back navigation
            } else {
                // Incorrect credentials, show a toast
                Toast.makeText(this, "Invalid email or password", Toast.LENGTH_SHORT).show()
            }
        }

        btnGoogleSignIn.setOnClickListener {
            // Handle Google sign-in logic
            Toast.makeText(this, "Google sign-in clicked", Toast.LENGTH_SHORT).show()
        }

        btnFacebookSignIn.setOnClickListener {
            // Handle Facebook sign-in logic
            Toast.makeText(this, "Facebook sign-in clicked", Toast.LENGTH_SHORT).show()
        }

        forgotPassword.setOnClickListener {
            // Handle forgot password logic
            Toast.makeText(this, "Forgot Password clicked", Toast.LENGTH_SHORT).show()
        }

        register.setOnClickListener {
            // Handle register logic
            Toast.makeText(this, "Register clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
