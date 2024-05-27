package com.farizz.lafyuu

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class HomeActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        // Add OnClickListener for ImageView to navigate to FavoriteActivity
        val imageView: ImageView = findViewById(R.id.IVFavourite)
        imageView.setOnClickListener {
            val intent = Intent(this, FavouriteActivity::class.java)
            startActivity(intent)
        }

        val recyclerView = findViewById<RecyclerView>(R.id.rvFlashSale)
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)

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