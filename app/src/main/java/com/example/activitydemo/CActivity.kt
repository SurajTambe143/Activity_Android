package com.example.activitydemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class CActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c)
        Log.d("Activity cycle","Activity C onCreate is called")


        val btnA =findViewById<Button>(R.id.activityA_btn)
        val btnB =findViewById<Button>(R.id.activityB_btn)
        btnA.setOnClickListener {
            val intent= Intent(this,MainActivity::class.java)
            startActivity(intent)
        }

        btnB.setOnClickListener {
            val intent= Intent(this,BActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onStart() {
        super.onStart()
        Log.d("Activity cycle","Activity C onStart() is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d("Activity cycle","Activity C onResume() is called")
    }

    override fun onPause() {
        super.onPause()
        Log.d("Activity cycle","Activity C onPause() is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d("Activity cycle","Activity C onStop() is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d("Activity cycle","Activity C onDestroy() is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d("Activity cycle","Activity C onRestart() is called")
    }
}