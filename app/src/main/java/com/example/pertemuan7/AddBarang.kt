package com.example.pertemuan7

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.add_barang.*
import kotlinx.android.synthetic.main.result.*

class AddBarang : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.add_barang)
        bt_Next.setOnClickListener() {
            val gotoResult = Intent(this, Result::class.java)
            gotoResult.putExtra("barang",jT_nama.text.toString())
            gotoResult.putExtra("merk",jT_merk.text.toString())
            gotoResult.putExtra("qty",jT_Qty.text.toString())
            gotoResult.putExtra("harga",jTHarga.text.toString())
            startActivity(gotoResult)
        }
        backToHome1.setOnClickListener{
        val backtoHome = Intent (this, MainActivity::class.java)
            startActivity(backtoHome)
        }
    }
}