package com.testapp.ui.feature.uimodule.recycler.horizontal
import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.testapp.databinding.ActivityRecyclerBinding
import com.testapp.ui.feature.uimodule.recycler.horizontal.adapter.AdapterHorizontalRecycler

class RecyclerHorizontalActivity : AppCompatActivity() {

    private lateinit var bind: ActivityRecyclerBinding
    private lateinit var adapter: AdapterHorizontalRecycler
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
        name.add("Pizza Point") //0
        name.add("BaGallery") //3
        name.add("ELO") //4
        name.add("Jomo.pk") //5
        name.add("OH My Grill") //6
        name.add("KHAZANY") //7
        name.add("Optp") //8



        adapter = AdapterHorizontalRecycler(this, name)
        bind.recycler.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
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