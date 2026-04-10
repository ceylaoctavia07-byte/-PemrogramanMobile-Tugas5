package com.example.mahasale

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class ElektronikActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_elektronik)

        val kategori = intent.getStringExtra("KATEGORI") ?: "Elektronik"
        val tvJudul  = findViewById<TextView>(R.id.tvJudulElektronik)
        tvJudul.text = "📱 $kategori"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerElektronik)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BarangAdapter(getDataElektronik())
    }

    private fun getDataElektronik(): List<Barang> {
        return listOf(
            Barang(1, "iPhone 12 Pro 128GB", "10 Apr 2025", "Jakarta Barat", 6500000),
            Barang(2, "Samsung Galaxy S21", "09 Apr 2025", "Depok", 4800000),
            Barang(3, "Laptop Asus ROG", "08 Apr 2025", "Bekasi", 9000000),
            Barang(4, "iPad Air Gen 4", "07 Apr 2025", "Tangerang", 5500000),
            Barang(5, "Earbuds Sony WF-1000XM4", "06 Apr 2025", "Bogor", 1200000),
            Barang(6, "Kamera Mirrorless Sony A6000", "05 Apr 2025", "Bandung", 4200000),
            Barang(7, "Nintendo Switch OLED", "04 Apr 2025", "Surabaya", 3800000),
            Barang(8, "Smartwatch Xiaomi Mi Watch", "03 Apr 2025", "Malang", 750000)
        )
    }
}
