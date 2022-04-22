package com.testapp.ui.feature.uimodule

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.testapp.databinding.ActivityUiBinding
import com.testapp.ui.feature.uimodule.layout.LayoutActivity
import com.testapp.ui.feature.uimodule.recycler.RecyclerActivity

class UIActivity : AppCompatActivity() {

    private lateinit var bind: ActivityUiBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityUiBinding.inflate(layoutInflater)
        setContentView(bind.root)
        setupLayout()
        setupClickListeners()

    }


    //______________________________________________________________________________________________ FUNCTIONS
    private fun setupLayout() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupClickListeners() {
        bind.btntest.setOnClickListener {
            startActivity(Intent(this, LayoutActivity::class.java))
        }
        bind.btntest2.setOnClickListener {
            startActivity(Intent(this, RecyclerActivity::class.java))
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