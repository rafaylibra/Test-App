package com.testapp.ui.feature.basicmodule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import com.testapp.databinding.ActivityBasicBinding
import com.testapp.ui.feature.basicmodule.programming.ProgrammingActivity
import com.testapp.ui.feature.uimodule.layout.frame.FrameActivity

class BasicActivity : AppCompatActivity() {

    private lateinit var bind: ActivityBasicBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityBasicBinding.inflate(layoutInflater)
        setContentView(bind.root)
        setupLayout()
        setupClickListeners()
    }

    //______________________________________________________________________________________________ FUNCTIONS
    private fun setupLayout() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun setupClickListeners() {
        bind.btnProgramming.setOnClickListener {
            startActivity(Intent(this, ProgrammingActivity::class.java))
        }
        bind.btnOOP.setOnClickListener {
            Toast.makeText(this, "Learn by yourself", Toast.LENGTH_SHORT).show()
        }
        bind.btnAndroid.setOnClickListener {
            Toast.makeText(this, "Android", Toast.LENGTH_SHORT).show()
        }
        bind.btnArch.setOnClickListener {
            Toast.makeText(this, "Arch", Toast.LENGTH_SHORT).show()
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