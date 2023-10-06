package com.example.activitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("Activity cycle","Activity A onCreate is called")

        val btnB =findViewById<Button>(R.id.activityB_btn)
        val btnC =findViewById<Button>(R.id.activityC_btn)

        btnB.setOnClickListener {
            val intent= Intent(this,BActivity::class.java)
            startActivity(intent)
        }

        btnC.setOnClickListener {
            val intent= Intent(this,CActivity::class.java)
            startActivity(intent)
        }

    }
    override fun onStart() {
        super.onStart()
        Log.d("Activity cycle","Activity A onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity cycle","Activity A onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity cycle","Activity A onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity cycle","Activity A onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity cycle","Activity A onDestroy() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity cycle","Activity A onRestart() is called")
    }
}