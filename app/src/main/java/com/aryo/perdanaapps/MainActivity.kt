package com.aryo.perdanaapps

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import android.widget.Button
import android.content.Intent
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHome = findViewById<Button>(R.id.btnHome)
        val btnSettings = findViewById<Button>(R.id.btnSettings)
        val btnKeluar = findViewById<Button>(R.id.btnKeluar)
        btnHome.setOnClickListener {
            Toast.makeText(this, "Home ditekan", Toast.LENGTH_SHORT).show()
        }
        btnSettings.setOnClickListener {
            Toast.makeText(this, "Settings ditekan", Toast.LENGTH_SHORT).show()
        }
        btnKeluar.setOnClickListener {
            finishAffinity()
        }

        val button = findViewById<Button>(R.id.buttonGoToBiodata)
        button.setOnClickListener {
            val intent = Intent(this, Biodata::class.java)
            startActivity(intent)
        }
    }
}