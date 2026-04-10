package com.example.mahasale

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView

class BarangAdapter(private val listBarang: List<Barang>) :
    RecyclerView.Adapter<BarangAdapter.BarangViewHolder>() {

    inner class BarangViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvNama      : TextView  = itemView.findViewById(R.id.tvNamaBarang)
        val tvDeskripsi : TextView  = itemView.findViewById(R.id.tvDeskripsiBarang)
        val tvHarga     : TextView  = itemView.findViewById(R.id.tvHargaBarang)
        val tvTanggal   : TextView  = itemView.findViewById(R.id.tvTanggalBarang)
        val cardItem    : CardView  = itemView.findViewById(R.id.cardItemBarang)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BarangViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_barang, parent, false)
        return BarangViewHolder(view)
    }

    override fun onBindViewHolder(holder: BarangViewHolder, position: Int) {
        val barang = listBarang[position]
        holder.tvNama.text      = barang.name
        holder.tvDeskripsi.text = "📍 ${barang.location}"
        holder.tvHarga.text     = "Rp ${String.format("%,d", barang.price).replace(',', '.')}"
        holder.tvTanggal.text   = "📅 ${barang.date}"
    }

    override fun getItemCount(): Int = listBarang.size
}
