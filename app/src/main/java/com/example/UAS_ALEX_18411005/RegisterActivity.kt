package com.example.UAS_ALEX_18411005

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.UAS_ALEX_18411005.R
import kotlinx.android.synthetic.main.activity_register.*

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        SignIn.setOnClickListener {
            val intent = Intent ( this, LoginActivity::class.java)
            startActivity(intent)
        }

        btnregister.setOnClickListener {
            val intent = Intent ( this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}