package com.fadhlyaulia.uts201804019_2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

//import kotlinx.android.synthetic.main.activity_main.*


class Main2 : AppCompatActivity() {
    private lateinit var rvSekolah: RecyclerView
    private var list: ArrayList<Sekolah> = arrayListOf()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kota)

        rvSekolah = findViewById(R.id.rv_sekolah)
        rvSekolah.setHasFixedSize(true)

        list.addAll(DataKota.listData)
        showRecyclerViewListMode()
    }

    private fun showRecyclerViewListMode(){
        rvSekolah.layoutManager = LinearLayoutManager(this)
        val listSekolahAdapter = ListSekolahAdapter(list)
        rvSekolah.adapter = listSekolahAdapter
    }
}