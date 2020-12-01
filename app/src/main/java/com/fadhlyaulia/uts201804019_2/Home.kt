package com.fadhlyaulia.uts201804019_2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val kota: Button = findViewById(R.id.btn_kota)
        kota.setOnClickListener {
            val intent = Intent(this, Main2::class.java)
            startActivity(intent)
        }

        val profil: Button = findViewById(R.id.btn_profil)
        profil.setOnClickListener {
            val intent = Intent(this, Profil::class.java)
            startActivity(intent)
        }

        val product: Button = findViewById(R.id.btn_product)
        product.setOnClickListener{
            val intent = Intent(this, Ratingbar::class.java)
            startActivity(intent)
        }

    }
}


