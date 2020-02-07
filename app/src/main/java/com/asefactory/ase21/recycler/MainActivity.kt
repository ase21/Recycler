package com.asefactory.ase21.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.PagerSnapHelper
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.coroutineScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

class MainActivity : AppCompatActivity() {

    val numbers: ArrayList<Person> = ArrayList()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        addPerson()

        testRecycler.layoutManager = CenterZoomLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        val numberAdapter = NumberAdapter(numbers)
        val spanHelper = PagerSnapHelper()
        spanHelper.attachToRecyclerView(testRecycler)
        testRecycler.adapter = numberAdapter
        main()
    }

    private fun addPerson() {
        for (i in 1..10) {
            numbers.add(Person(i.toString()))
        }
    }

    fun main() = runBlocking {
        launch{
            delay(200L)
            println("1")
        }

        coroutineScope{
            launch {
                delay(500L)
                println("12")
            }
            delay(100L)
            println("3")
        }
        println("4")
    }
}
