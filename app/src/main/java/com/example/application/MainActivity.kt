package com.example.application

import android.content.Intent
import android.media.Image
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.annotation.RequiresApi

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        forTextChanged()
        init()
    }
    fun init()
    {
        var buttontb = findViewById<Button>(R.id.buttonTicketBuy)
        buttontb.setOnClickListener()
        {
            startActivity(Intent(this@MainActivity, BuyTicketActivity::class.java))
        }
        var imagebtnlineupbuy = findViewById<ImageView>(R.id.imageView1)
        imagebtnlineupbuy.setOnClickListener()
        {
            startActivity(Intent(this@MainActivity, LineUpActivity::class.java))
        }
    }
    fun forTextChanged(){
        var btnTicketBuy = findViewById<Button>(R.id.buttonTicketBuy)
        var imgbtn = findViewById<ImageView>(R.id.imageView1)
        btnTicketBuy.setBackground(getResources().getDrawable(R.drawable.button_activity))
        imgbtn.setBackground(getResources().getDrawable(R.drawable.background_imagebutton_activity))
    }
}