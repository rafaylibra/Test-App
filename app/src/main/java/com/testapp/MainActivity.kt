package com.testapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import androidx.appcompat.widget.AppCompatButton

class MainActivity : AppCompatActivity() {

    lateinit var btn2 :AppCompatButton
    lateinit var name :String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LifeCycle: Main", "onCreate")
        setContentView(R.layout.activity_main)
        btn2 = findViewById(R.id.btn2)
        btn2.setOnClickListener {
            Log.e("Activity: Main", "Btn2 Button is clicked")
            btn2.gravity = Gravity.START
        }
    }

    fun function1(view: View) {
        Log.e("Activity: Main", "UI Button is clicked")
        name = "Rafay"

        //var str: String = "rafay"

        //var is changeable
        //var i = 1
        //i = 2

        //val is unchangeable
        //val j = 2
        //j = 3

        val intent = Intent(this, UIActivity::class.java)
        startActivity(intent)
        //this.finish()
    }



    //______________________________________________________________________________________________ LIFECYCLE
    override fun onStart() {
        super.onStart()
        Log.e("LifeCycle: Main", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("LifeCycle: Main", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("LifeCycle: Main", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("LifeCycle: Main", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LifeCycle: Main", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("LifeCycle: Main", "onRestart")
    }

    //______________________________________________________________________________________________ BACK
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> { onBackPressed() }
        }
        return super.onOptionsItemSelected(item)
    }
}