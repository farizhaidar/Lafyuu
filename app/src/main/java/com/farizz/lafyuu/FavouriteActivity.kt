package com.farizz.lafyuu

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import android.widget.ImageView
import android.content.Intent

import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView

class FavouriteActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_favourite)

        val backButton: ImageView = findViewById(R.id.ivBack)
        backButton.setOnClickListener {
            val intent = Intent(this, HomeActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }

        val recyclerView = findViewById<RecyclerView>(R.id.rvFlashSale)
        recyclerView.layoutManager = GridLayoutManager(this, 2) // Menggunakan GridLayoutManager dengan 2 kolom

        val flashSaleItems = listOf(
            FlashSaleItem(R.drawable.shoes_1, "Shoe 1"),
            FlashSaleItem(R.drawable.shoes_1, "Shoe 2"),
            FlashSaleItem(R.drawable.shoes_1, "Shoe 3"),
            FlashSaleItem(R.drawable.shoes_1, "Shoe 4")
        )

        val adapter = FlashSaleAdapter(flashSaleItems)
        recyclerView.adapter = adapter
    }
}