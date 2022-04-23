package com.testapp.ui.feature.uimodule.recycler.adapter

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.annotation.LayoutRes
import androidx.recyclerview.widget.RecyclerView
import com.testapp.R
import com.testapp.databinding.ItemBasicRecyclerBinding
import com.testapp.ui.feature.uimodule.recycler.basic.RecyclerBasicActivity
import com.testapp.ui.feature.uimodule.recycler.image.RecyclerImageActivity

class AdapterRecycler(
    private val context: Context,
    private val data: ArrayList<String>
) : RecyclerView.Adapter<AdapterRecycler.RecyclerViewHolder>() {

    lateinit var bind: ItemBasicRecyclerBinding

    override fun onBindViewHolder(holder: RecyclerViewHolder, position: Int) {
        val item = data[position]
        updateUI(holder, item, position)
        clickListeners(holder, item, position)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerViewHolder {
        val v = parent.inflate(R.layout.item_basic_recycler, false)
        bind = ItemBasicRecyclerBinding.bind(v)
        return RecyclerViewHolder(v)
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
    private fun updateUI(holder: RecyclerViewHolder, item: String, position: Int) {
        bind.title.text = item
    }

    private fun clickListeners(holder: RecyclerViewHolder, item: String, position: Int) {
        bind.root.setOnClickListener {
            when (position) {
                0 -> context.startActivity(Intent(context, RecyclerBasicActivity::class.java))
                1 -> context.startActivity(Intent(context, RecyclerImageActivity::class.java))//context.startActivity(Intent(context, RecyclerImageActivity::class.java))
                2 -> Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                3 -> Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
                4 -> Toast.makeText(context, item, Toast.LENGTH_SHORT).show()
            }
            Toast.makeText(context, item, Toast.LENGTH_SHORT).show()

        }
    }

    inner class RecyclerViewHolder(v: View) : RecyclerView.ViewHolder(v)
}