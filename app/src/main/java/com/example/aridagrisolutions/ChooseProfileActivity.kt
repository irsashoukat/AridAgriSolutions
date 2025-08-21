package com.example.aridagrisolutions

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class ChooseProfileActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_choose_profile)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        findViewById<Button>(R.id.btnfarmer).setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btnexpert).setOnClickListener {
            val intent = Intent(this, login::class.java)
            startActivity(intent)
        }
        findViewById<Button>(R.id.btnadmin).setOnClickListener {
            var intent = Intent(this, login::class.java)
            startActivity(intent)
        }
    }
}