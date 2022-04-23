package com.testapp.ui.feature.basicmodule.programming

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import com.testapp.databinding.ActivityProgrammingBinding

class ProgrammingActivity : AppCompatActivity() {

    private lateinit var bind: ActivityProgrammingBinding
    var name1 = "Text 1"
    val name2 = "Text 2"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityProgrammingBinding.inflate(layoutInflater)
        setContentView(bind.root)
        setupLayout()
        setupClickListeners()
    }

    //______________________________________________________________________________________________ FUNCTIONS
    private fun setupLayout() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        bind.btn1.text = name1
        bind.btn2.text = name2
    }

    private fun setupClickListeners() {
        //var is changeable
        //var i = 1
        //i = 2

        //val is unchangeable
        //val j = 2
        //j = 3

        bind.btn1.setOnClickListener {
            name1 = "Text 1 is changed"
            bind.btn1.text = name1
            Toast.makeText(this, "Changed Success", Toast.LENGTH_SHORT).show()
        }
        bind.btn2.setOnClickListener {
            //text2 = "Text 2 is changed"
            bind.btn2.text = name2
            Toast.makeText(this, "val is unchangeable", Toast.LENGTH_SHORT).show()
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