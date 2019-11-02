package com.example.hitungluas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.google.android.gms.ads.AdRequest
import com.google.android.gms.ads.AdView
import com.google.android.gms.ads.InterstitialAd
import com.google.android.gms.ads.MobileAds

class MainActivity : AppCompatActivity(),
    View.OnClickListener {

    lateinit var btn_persegi: Button
    lateinit var btn_segitiga: Button
    lateinit var btn_persegipanjang: Button
    lateinit var mAdView: AdView
    lateinit var mInterstitialAd: InterstitialAd

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_persegi = findViewById(R.id.btn_persegi)
        btn_segitiga = findViewById(R.id.btn_segitiga)
        btn_persegipanjang = findViewById(R.id.btn_persegipanjang)

        btn_persegi.setOnClickListener(this)
        btn_segitiga.setOnClickListener(this)
        btn_persegipanjang.setOnClickListener(this)

        MobileAds.initialize(this, getString(R.string.id_apk))
        mAdView = findViewById(R.id.adView)
        val adRequest = AdRequest.Builder().build()
        mAdView.loadAd(adRequest)
        mInterstitialAd = InterstitialAd(this)
        mInterstitialAd.adUnitId = "ca-app-pub-8966384247273297/1922200968"
        mInterstitialAd.loadAd(AdRequest.Builder().build())

//        btn_persegi.setOnClickListener {
//            if (mInterstitialAd.isLoaded) {
//                mInterstitialAd.show()
//            } else {
//                Log.d("TAG", "The interstitial wasn't loaded yet.")
//            }
//        }
    }

    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn_persegi -> {
                val pindah = Intent(this@MainActivity, persegi::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                else {
               Log.d("TAG", "The interstitial wasn't loaded yet.")
           }
                startActivity(pindah)



            }
            R.id.btn_segitiga -> {val pindah = Intent(this@MainActivity,segitiga::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.")
                }
                startActivity(pindah)


            }
            R.id.btn_persegipanjang -> {
                val pindah = Intent(this@MainActivity, hitung::class.java)
                if (mInterstitialAd.isLoaded) {
                    mInterstitialAd.show()
                }
                else {
                    Log.d("TAG", "The interstitial wasn't loaded yet.")
                }
                startActivity(pindah)
            }
        }
    }
}
