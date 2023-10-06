package com.example.activitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class BActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b)
        Log.d("Activity cycle","Activity B onCreate is called")

        val btnA =findViewById<Button>(R.id.activityA_btn)
        val btnC =findViewById<Button>(R.id.activityC_btn)
        btnA.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btnC.setOnClickListener {
            val intent= Intent(this,CActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("Activity cycle","Activity B onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity cycle","Activity B onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity cycle","Activity B onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity cycle","Activity B onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity cycle","Activity B onDestroy() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity cycle","Activity B onRestart() is called")
    }
}