package com.example.applib

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_authorization.*

class AuthorizationActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_authorization)

        Ready.setOnClickListener{
            val intent = Intent (this, MainActivity::class.java)
            startActivity(intent)
        }

    }
}
