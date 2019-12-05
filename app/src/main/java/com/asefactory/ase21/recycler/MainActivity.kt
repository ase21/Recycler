package com.asefactory.ase21.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    val numbers: ArrayList<String> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addNumbers()

        testRecycler.layoutManager = CenterZoomLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val numberAdapter = NumberAdapter(numbers)
        val spanHelper = PagerSnapHelper()
        spanHelper.attachToRecyclerView(testRecycler)
        testRecycler.adapter = numberAdapter
    }

    private fun addNumbers() {
        for (i in 1..10) {
            numbers.add(i.toString())
        }
    }
}
