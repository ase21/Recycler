package com.asefactory.ase21.recycler

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_simple.view.*

class NumberAdapter(val numbers: ArrayList<String>) : RecyclerView.Adapter<MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_simple, parent, false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView.text = numbers.get(position)
    }

    override fun getItemCount(): Int {
        return numbers.size
    }
}

class MyViewHolder(view: View) : RecyclerView.ViewHolder(view) {
    val textView = view.textView

}
