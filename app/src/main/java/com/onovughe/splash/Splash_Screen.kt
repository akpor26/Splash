package com.onovughe.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class Splash_Screen : AppCompatActivity() {

    private val SPLASH_TIME: Long = 5000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)

        //Step 1 Create Empty Activity for the splash screen
        //Step 2 Make layout relative for the splash xml
        //Step 3 Splash kt code below
        //Go to Value folder and create style xml
        //Step 5 go manifest for change the position of splash activity

        Handler().postDelayed({
            startActivity(Intent (this, MainActivity::class.java))
            finish()
        },SPLASH_TIME)
    }
}