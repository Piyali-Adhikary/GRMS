package com.piyali.grms_kotlin.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity
import com.piyali.grms_kotlin.ui.MainActivity
import com.piyali.grms_kotlin.R
import kotlinx.coroutines.*

@Suppress("DEPRECATION")
class SplashActivity : AppCompatActivity(){

    val activityScope = CoroutineScope(Dispatchers.Main)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)


        activityScope.launch {
            delay(3000)

            var intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }

    override fun onPause() {
        activityScope.cancel()
        super.onPause()
    }
}