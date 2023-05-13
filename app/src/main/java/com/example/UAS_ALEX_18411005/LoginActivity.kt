package com.example.UAS_ALEX_18411005

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.UAS_ALEX_18411005.R
import kotlinx.android.synthetic.main.activity_login.*

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)


        SignUp.setOnClickListener {
            val intent = Intent ( this, RegisterActivity::class.java)
            startActivity(intent)
        }

        btnlogin.setOnClickListener {
            val intent = Intent ( this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}