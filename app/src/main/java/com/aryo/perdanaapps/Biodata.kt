package com.aryo.perdanaapps

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class Biodata : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.biodata)

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            finish()
        }
    }
}