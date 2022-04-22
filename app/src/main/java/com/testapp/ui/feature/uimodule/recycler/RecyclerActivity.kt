package com.testapp.ui.feature.uimodule.recycler

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.testapp.databinding.ActivityRecyclerBinding
import com.testapp.ui.feature.uimodule.recycler.adapter.AdapterRecycler

class RecyclerActivity : AppCompatActivity() {

    private lateinit var bind: ActivityRecyclerBinding
    private lateinit var adapter: AdapterRecycler
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
        //person = Person()
        //val name = arrayListOf("Shayan", "Rafay")
        val name = ArrayList<String>()
        name.add("Basic Recycler View")
        name.add("Image Recycler View")
        name.add("Horizontal Recycler View")
        name.add("Multi-Item Recycler View")
        name.add("Parent Child Recycler View")
        adapter = AdapterRecycler(this, name)
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