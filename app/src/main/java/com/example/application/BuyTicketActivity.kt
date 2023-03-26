package com.example.application

import android.content.Intent
import android.os.Build
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AppCompatActivity

class BuyTicketActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.buyticket_main)
        init()
        forTextChanged()
        forImageChanged()
    }
    fun init(){
        var imagebtnpay = findViewById<ImageView>(R.id.imageView2)
        imagebtnpay.setOnClickListener()
        {
            startActivity(Intent(this@BuyTicketActivity,LineUpActivity::class.java))
        }
    }
    fun forTextChanged() {
        var FIO = findViewById<EditText>(R.id.editTextTextPersonName)
        var Mail = findViewById<EditText>(R.id.editTextTextEmailAddress)
        var btnPay = findViewById<Button>(R.id.buttonPay)

        FIO.addTextChangedListener(object : TextWatcher {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                if (FIO.text.length > 0 && Mail.text.length > 0) {
                    btnPay.setTextColor(this@BuyTicketActivity.getColor(R.color.white))
                    btnPay.background = this@BuyTicketActivity.getDrawable(R.drawable.background_buttonpay_activity)

                }
                if (FIO.text.length == 0 || Mail.text.length == 0) {
                    btnPay.setTextColor(this@BuyTicketActivity.getColor(R.color.white))
                    btnPay.background = this@BuyTicketActivity.getDrawable(R.drawable.background_text_button_pay)

                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        })
        Mail.addTextChangedListener(object : TextWatcher {
            @RequiresApi(Build.VERSION_CODES.M)
            override fun afterTextChanged(s: Editable) {
                if (FIO.text.length > 0 && Mail.text.length > 0) {
                    btnPay.setTextColor(this@BuyTicketActivity.getColor(R.color.white))
                    btnPay.background = this@BuyTicketActivity.getDrawable(R.drawable.background_buttonpay_activity)

                }
                if (FIO.text.length == 0 || Mail.text.length == 0) {
                    btnPay.setTextColor(this@BuyTicketActivity.getColor(R.color.white))
                    btnPay.background = this@BuyTicketActivity.getDrawable(R.drawable.background_text_button_pay)

                }
            }

            override fun beforeTextChanged(s: CharSequence, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence, start: Int, before: Int, count: Int) {

            }
        })
    }
    fun forImageChanged(){
        var imgbtn = findViewById<ImageView>(R.id.imageView2)
        imgbtn.setBackground(getResources().getDrawable(R.drawable.background_imagebutton_activity))
    }
}