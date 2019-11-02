package com.example.hitungluas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.widget.TextView


class hitung : AppCompatActivity() {

    lateinit var edt_panjang: EditText
    lateinit var edt_lebar: EditText
    lateinit var btn_hitung:Button
    lateinit var txt_luas: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_hitung)

        edt_panjang = findViewById(R.id.edt_panjang)
        edt_lebar = findViewById(R.id.edt_lebar)
        btn_hitung = findViewById(R.id.btn_hitung)
        txt_luas = findViewById(R.id.txt_luas)

        getSupportActionBar()?.setTitle("Hitung Luas Persegi Panjang");

        btn_hitung.setOnClickListener {
            var panjang: String = edt_panjang.text.toString()
            var lebar: String = edt_lebar.text.toString()
            if (TextUtils.isEmpty(panjang)) {
                edt_panjang.setError("TIDAK BOLEH KOSONG")
                edt_panjang.requestFocus()
            } else if (TextUtils.isEmpty(lebar)) {
                edt_lebar.setError("TIDAK BOLEH KOSONG")
                edt_lebar.requestFocus()
            } else {
                var panjang= panjang.toDouble()
                var lebar = lebar.toDouble()
                var hasil = panjang * lebar
                txt_luas.text=hasil.toString()
            }
        }


    }
}
