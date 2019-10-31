package com.example.proyekuts

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.add_barang.*
import kotlinx.android.synthetic.main.result.*

class Result : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.result)

        val getNama:String = intent.getStringExtra("barang")
        val getMerk:String = intent.getStringExtra("merk")
        val getQty:String = intent.getStringExtra("qty")
        val getHarga:String = intent.getStringExtra("harga")

        tx_nama.setText(getNama)
        tx_merk.setText(getMerk)
        tx_Qty.setText(getQty)

        val htgHarga = getQty.toInt() * getHarga.toInt()
//        val htgHarga = Integer.valueOf(getQty)

        tx_harga.setText(htgHarga.toString())

        backToHome2.setOnClickListener{
            val backtoHome = Intent (this, MainActivity::class.java)
            startActivity(backtoHome)
            finish()
        }
        bt_repeat.setOnClickListener(){
            val backtoInput = Intent(this, AddBarang::class.java)
            startActivity(backtoInput)
            finish()
        }
    }
}