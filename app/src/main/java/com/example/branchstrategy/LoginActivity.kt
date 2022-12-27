package com.example.branchstrategy

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        Log.d("LoginActivity", "여기는 로그인 화면")
    }
}