package com.example.UAS_ALEX_18411005

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.UAS_ALEX_18411005.R

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageList = listOf<Image>(
                Image(
                        R.drawable.phijau,
                        "Pemancinngan Permata Hijau",
                        "Salah satu lokasi pemancingan umum di Koya, ada beberapa tempat pemancingan umum disekitar Koya namun Pemancingan Permata Hijau mempunya kolam yang luas serta lokasi yang nyaman jauh kedalam sehingga lebih hening untuk sekedar memancing sambil beristirahat bersama keluarga...lokasi di Jl. Bandungan Tami No. 99 Koya Barat, Muara Tami, Jayapura 99351 Indonesia"
                ),
                Image(
                        R.drawable.adikencana,
                        "Pemancingan Adi Kencana",
                        "Pemancingan yang berada di Kota Jayapura. Warga Kota Jayapura memanfaatkan pemancingan ini untuk olahraga menyalurkan hobi mancing dan wisata memancing bersama keluarga. Pemancingan Adi Kencana juga menawarkan menu makanan yang bisa dipesan sembari memancing, atau juga bisa memasak hasil pancingan.\n" +
                                "\n" +
                                "Pemancingan Kota Jayapura terbuka untuk umum dengan harga tiket masuk yang murah dan terjangkau."
                ),
                Image(
                        R.drawable.mancing,
                        "Pemancingan Tirtayasa 212",
                        "Pemancingan yang berada di Kota Jayapura. Warga Kota Jayapura memanfaatkan pemancingan ini untuk olahraga menyalurkan hobi mancing dan wisata memancing bersama keluarga. Pemancingan Tirtayasa juga menawarkan menu makanan yang bisa dipesan sembari memancing, atau juga bisa memasak hasil pancingan."
                ),
                Image(
                        R.drawable.spot,
                        "Pemancingan Novi Chandra",
                        "Pemancingan yang berada di Kota Jayapura. Warga Kota Jayapura memanfaatkan pemancingan ini untuk olahraga menyalurkan hobi mancing dan wisata memancing bersama keluarga. Pemancingan Novi Chandra juga menawarkan menu makanan yang bisa dipesan sembari memancing, atau juga bisa memasak hasil pancingan."
                ),
        )
                Image(
                        R.drawable.cing,
                        "Pemancingan Koya Resort",
                        "Pemancingan yang berada di Kota Jayapura. Warga Kota Jayapura memanfaatkan pemancingan ini untuk olahraga menyalurkan hobi mancing dan wisata memancing bersama keluarga. Pemancingan Koya Resort juga menawarkan menu makanan yang bisa dipesan sembari memancing, atau juga bisa memasak hasil pancingan."
                )



        val recyclerView = findViewById<RecyclerView>(R.id.imageRecyclerView)
        recyclerView.layoutManager=LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter= ImageAdapter(this, imageList) {
            val intent = Intent (this, DetailActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)
        }

    }
}