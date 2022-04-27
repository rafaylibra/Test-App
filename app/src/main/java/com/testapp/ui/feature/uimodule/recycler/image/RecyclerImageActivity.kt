package com.testapp.ui.feature.uimodule.recycler.image

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.testapp.databinding.ActivityImageRecyclerBinding
import com.testapp.databinding.ActivityRecyclerBinding
import com.testapp.ui.feature.uimodule.recycler.basic.adapter.AdapterBasicRecycler
import com.testapp.ui.feature.uimodule.recycler.image.adapter.AdapterImageRecycler

class RecyclerImageActivity : AppCompatActivity() {

    private lateinit var bind: ActivityImageRecyclerBinding
    private lateinit var adapter: AdapterImageRecycler
    //private lateinit var person: Person

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bind = ActivityImageRecyclerBinding.inflate(layoutInflater)
        setContentView(bind.root)
        setupLayout()
        setupClickListeners()
    }

    //______________________________________________________________________________________________ FUNCTIONS
    private fun setupLayout() {
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        //recycler view
        val name = ArrayList<String>()
        name.add("Red Apple") //0
        name.add("BaGallery") //3
        name.add("ELO") //4
        name.add("Jomo.pk") //5
        name.add("OH My Grill") //6
        name.add("KHAZANY") //7
        name.add("Optp") //8



        adapter = AdapterImageRecycler(this, name)
        bind.imagerecycler.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        bind.imagerecycler.adapter = adapter
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