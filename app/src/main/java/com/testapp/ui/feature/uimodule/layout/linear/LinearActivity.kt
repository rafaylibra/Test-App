package com.testapp.ui.feature.uimodule.layout.linear

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import com.testapp.R

class LinearActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_linear)
    }


    //______________________________________________________________________________________________ FUNCTIONS



    //______________________________________________________________________________________________ LIFECYCLE
    override fun onStart() {
        super.onStart()
        Log.e("LifeCycle: Linear", "onStart")
    }

    override fun onResume() {
        super.onResume()
        Log.e("LifeCycle: Linear", "onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.e("LifeCycle: Linear", "onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.e("LifeCycle: Linear", "onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.e("LifeCycle: Linear", "onDestroy")
    }

    override fun onRestart() {
        super.onRestart()
        Log.e("LifeCycle: Linear", "onRestart")
    }

    //______________________________________________________________________________________________ BACK
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> { onBackPressed() }
        }
        return super.onOptionsItemSelected(item)
    }
}