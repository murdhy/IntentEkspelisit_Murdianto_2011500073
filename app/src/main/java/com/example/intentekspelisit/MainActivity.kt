package com.example.intentekspelisit

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etNim = findViewById<EditText>(R.id.etNim)
        val etNama = findViewById<EditText>(R.id.etNama)
        val btnProses = findViewById<Button>(R.id.btnProses)

        btnProses.setOnClickListener{
            if ("${etNim.text}".isNotEmpty() && "${etNama.text}".isNotEmpty()) {
                val i = Intent(this@MainActivity, tampil_data_activity::class.java)
                i.putExtra("NIM", "${etNim.text}")
                i.putExtra("Nama","${etNama.text}")
                startActivity(i)
            } else
                Toast.makeText(this@MainActivity,"Nim atau nama belum diisi", Toast.LENGTH_SHORT).show()

        }
    }
}