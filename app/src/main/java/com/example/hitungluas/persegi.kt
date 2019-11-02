package com.example.hitungluas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class persegi : AppCompatActivity() {

    lateinit var edt_sisi: EditText
    lateinit var edt_sisi1: EditText
    lateinit var btn_hitung: Button
    lateinit var txt_luas: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_persegi)

        edt_sisi = findViewById(R.id.edt_sisi)
        edt_sisi1 = findViewById(R.id.edt_sisi1)
        btn_hitung = findViewById(R.id.btn_hitung)
        txt_luas = findViewById(R.id.txt_luas)

        getSupportActionBar()?.setTitle("Hitung Luas Panjang");

            btn_hitung.setOnClickListener {
                var sisi: String = edt_sisi.text.toString()
                var sisi1: String = edt_sisi1.text.toString()
                if (TextUtils.isEmpty(sisi)) {
                    edt_sisi.setError("TIDAK BOLEH KOSONG")
                    edt_sisi.requestFocus()
                } else if (TextUtils.isEmpty(sisi1)) {
                    edt_sisi1.setError("TIDAK BOLEH KOSONG")
                    edt_sisi1.requestFocus()
                } else {
                    var sisi= sisi.toDouble()
                    var sisi1 = sisi1.toDouble()
                    var hasil = sisi * sisi1
                    txt_luas.text = hasil.toString()
                }
            }
        }
    }
