package com.example.myapplication // აუცილებლად შეამოწმე ეს სახელი!

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // მხოლოდ Layout-ის დასეტვა. მეტი არაფერი!
        setContentView(R.layout.activity_main)
    }
}