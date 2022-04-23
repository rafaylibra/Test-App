package com.testapp.ui.feature

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import com.testapp.R
import com.testapp.ui.feature.basicmodule.BasicActivity
import com.testapp.ui.feature.datamodule.DataActivity
import com.testapp.ui.feature.uimodule.UIActivity

class MainActivity : AppCompatActivity() {

    lateinit var btnUI :AppCompatButton
    lateinit var btnData :AppCompatButton
    lateinit var name :String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.e("LifeCycle: Main", "onCreate")
        setContentView(R.layout.activity_main)
        setupLayout()
        setupClickListeners()
    }

    //used for initialization of views
    //setting default values
    private fun setupLayout() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        btnUI = findViewById(R.id.btnUI)
        btnData = findViewById(R.id.btnData)
    }

    private fun setupClickListeners() {
        btnUI.setOnClickListener {
            startActivity(Intent(this, UIActivity::class.java))
        }
        btnData.setOnClickListener {
            startActivity(Intent(this, DataActivity::class.java))
        }
    }

    fun funcBasicClick(view: View) {
        startActivity(Intent(this, BasicActivity::class.java))
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
//test
//test2
//test3
//test4
//test5
//test6