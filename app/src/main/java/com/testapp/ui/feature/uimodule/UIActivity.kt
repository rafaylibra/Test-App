package com.testapp.ui.feature.uimodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.widget.AppCompatButton
import com.testapp.R
import com.testapp.ui.feature.uimodule.layout.LayoutActivity

class UIActivity : AppCompatActivity() {

    lateinit var btn1 : AppCompatButton
    lateinit var btn2 :AppCompatButton
    lateinit var btn3 :AppCompatButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ui)
        Log.e("LifeCycle: UI", "onCreate")
        setupLayout()
        setupClickListeners()
    }


    //______________________________________________________________________________________________ FUNCTIONS
    private fun setupLayout() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)
    }

    private fun setupClickListeners() {
        btn1.setOnClickListener {
            startActivity(Intent(this, LayoutActivity::class.java))
        }
        btn2.setOnClickListener {
            //startActivity(Intent(this, RelativeActivity::class.java))
        }
    }


    //______________________________________________________________________________________________ LIFECYCLE
    override fun onStart() {
        super.onStart()
        Log.e("LifeCycle: UI", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("LifeCycle: UI", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("LifeCycle: UI", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("LifeCycle: UI", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LifeCycle: UI", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("LifeCycle: UI", "onRestart")
    }

    //______________________________________________________________________________________________ BACK
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> { onBackPressed() }
        }
        return super.onOptionsItemSelected(item)
    }
}