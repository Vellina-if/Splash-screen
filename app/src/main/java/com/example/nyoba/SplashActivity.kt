package com.example.nyoba

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {

    private val SPLASH_DISPLAY_TIME: Long = 3000 // 3 detik

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Sembunyikan Action Bar jika ada
        supportActionBar?.hide()

        // Handler untuk menunda pindah halaman
        Handler(Looper.getMainLooper()).postDelayed({
            // Pindah ke MainActivity setelah splash selesai
            val mainIntent = Intent(this, MainActivity::class.java)
            startActivity(mainIntent)
            finish() // tutup activity ini agar tidak bisa kembali dengan tombol back
        }, SPLASH_DISPLAY_TIME)
    }
}