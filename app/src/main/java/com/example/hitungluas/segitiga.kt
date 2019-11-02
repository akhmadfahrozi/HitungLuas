package com.example.hitungluas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class segitiga : AppCompatActivity() {

    lateinit var edt_alas: EditText
    lateinit var edt_tinggi: EditText
    lateinit var btn_hitung: Button
    lateinit var txt_luas: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_segitiga)

        edt_alas = findViewById(R.id.edt_alas)
        edt_tinggi = findViewById(R.id.edt_tinggi)
        btn_hitung = findViewById(R.id.btn_hitung)
        txt_luas = findViewById(R.id.txt_luas)



        btn_hitung.setOnClickListener {
            var alas: String = edt_alas.text.toString()
            var tinggi: String = edt_tinggi.text.toString()
            if (TextUtils.isEmpty(alas)) {
                edt_alas.setError("TIDAK BOLEH KOSONG")
                edt_alas.requestFocus()
            } else if (TextUtils.isEmpty(tinggi)) {
                edt_tinggi.setError("TIDAK BOLEH KOSONG")
                edt_tinggi.requestFocus()
            } else {
                var alas = alas.toDouble()
                var tinggi = tinggi.toDouble()
                var hasil = 0.5 * alas * tinggi
                txt_luas.text = hasil.toString()
            }
        }
    }
}
