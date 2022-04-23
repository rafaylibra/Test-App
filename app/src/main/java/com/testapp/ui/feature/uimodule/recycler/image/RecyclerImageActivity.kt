package com.testapp.ui.feature.uimodule.recycler.image

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.testapp.databinding.ActivityRecyclerBinding
import com.testapp.ui.feature.uimodule.recycler.basic.adapter.AdapterBasicRecycler
import com.testapp.ui.feature.uimodule.recycler.image.adapter.AdapterImageRecycler

class RecyclerImageActivity : AppCompatActivity() {

    private lateinit var bind: ActivityRecyclerBinding
    private lateinit var adapter: AdapterImageRecycler
    //private lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityRecyclerBinding.inflate(layoutInflater)
        setContentView(bind.root)
        setupLayout()
        setupClickListeners()
    }

    //______________________________________________________________________________________________ FUNCTIONS
    private fun setupLayout() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //recycler view
        val name = ArrayList<String>()
        name.add("1") //0
        name.add("2") //3
        name.add("3") //4
        name.add("4") //5
        name.add("5") //6
        name.add("6") //7
        name.add("7") //8
        adapter = AdapterImageRecycler(this, name)
        bind.recycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        bind.recycler.adapter = adapter
    }

    private fun setupClickListeners() {
    }

    //______________________________________________________________________________________________ BACK
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> onBackPressed()
        }
        return super.onOptionsItemSelected(item)
    }
}