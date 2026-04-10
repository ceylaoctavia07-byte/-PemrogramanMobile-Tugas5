package com.example.mahasale

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.cardview.widget.CardView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val username = intent.getStringExtra("USERNAME") ?: "Pengguna"

        val tvWelcome  = findViewById<TextView>(R.id.tvWelcome)
        val tvUsername = findViewById<TextView>(R.id.tvUsername)
        tvWelcome.text  = "Selamat Datang di MahaSale! 👋"
        tvUsername.text = "Halo, $username"

        val cardBarang     = findViewById<CardView>(R.id.cardMenuBarang)
        val cardElektronik = findViewById<CardView>(R.id.cardMenuElektronik)
        val cardFashion    = findViewById<CardView>(R.id.cardMenuFashion)

        cardBarang.setOnClickListener {
            val intent = Intent(this, BarangActivity::class.java)
            intent.putExtra("KATEGORI", "Semua Barang")
            startActivity(intent)
        }

        cardElektronik.setOnClickListener {
            val intent = Intent(this, ElektronikActivity::class.java)
            intent.putExtra("KATEGORI", "Elektronik")
            startActivity(intent)
        }

        cardFashion.setOnClickListener {
            val intent = Intent(this, BarangActivity::class.java)
            intent.putExtra("KATEGORI", "Fashion")
            startActivity(intent)
        }
    }
}
