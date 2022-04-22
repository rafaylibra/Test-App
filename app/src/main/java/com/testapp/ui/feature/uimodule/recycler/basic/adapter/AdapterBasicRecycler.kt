package com.testapp.ui.feature.uimodule.recycler.basic.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.testapp.R
import com.testapp.databinding.ItemBasicRecyclerBinding

class AdapterBasicRecycler(
    private val context: Context,
    private val data: ArrayList<String>
) : RecyclerView.Adapter<AdapterBasicRecycler.BasicViewHolder>() {

    lateinit var bind: ItemBasicRecyclerBinding

    override fun onBindViewHolder(holder: BasicViewHolder, position: Int) {
        val item = data[position]
        updateUI(holder, item, position)
        clickListeners(holder, item, position)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BasicViewHolder {
        val v = parent.inflate(R.layout.item_basic_recycler, false)
        bind = ItemBasicRecyclerBinding.bind(v)
        return BasicViewHolder(v)
    }
    private fun ViewGroup.inflate(@LayoutRes layoutRes: Int, attachToRoot: Boolean = false): View {
        return LayoutInflater.from(context).inflate(layoutRes, this, attachToRoot)
    }
    override fun getItemCount(): Int {
        return data.size
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getItemViewType(position: Int): Int {
        return position
    }
    //______________________________________________________________________________________________
    private fun updateUI(holder: BasicViewHolder, item: String, position: Int) {
        bind.title.text = item
    }

    private fun clickListeners(holder: BasicViewHolder, item: String, position: Int) {
        bind.root.setOnClickListener {
            Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
        }
    }

    inner class BasicViewHolder(v: View) : RecyclerView.ViewHolder(v)
}