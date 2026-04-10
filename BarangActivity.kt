package com.example.mahasale

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class BarangActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barang)

        val kategori = intent.getStringExtra("KATEGORI") ?: "Semua Barang"
        val tvJudul  = findViewById<TextView>(R.id.tvJudulBarang)
        tvJudul.text = "📦 $kategori"

        val recyclerView = findViewById<RecyclerView>(R.id.recyclerBarang)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = BarangAdapter(getDataBarang())
    }

    private fun getDataBarang(): List<Barang> {
        return listOf(
            Barang(1, "Tas Kulit Branded", "10 Apr 2025", "Jakarta Selatan", 150000),
            Barang(2, "Sepatu Sneakers Nike", "09 Apr 2025", "Bandung", 250000),
            Barang(3, "Kemeja Flannel", "08 Apr 2025", "Surabaya", 80000),
            Barang(4, "Jam Tangan Casio", "07 Apr 2025", "Yogyakarta", 200000),
            Barang(5, "Celana Jeans Levis", "06 Apr 2025", "Semarang", 120000),
            Barang(6, "Jaket Kulit", "05 Apr 2025", "Medan", 350000),
            Barang(7, "Dress Batik", "04 Apr 2025", "Solo", 95000),
            Barang(8, "Sandal Birkenstock", "03 Apr 2025", "Bali", 180000)
        )
    }
}
