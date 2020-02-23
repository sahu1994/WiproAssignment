package com.test.wiproassignment.view

import android.app.Activity
import android.os.Bundle
import com.test.wiproassignment.R

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addListFragment()
    }


    //Adding fragment in home activity
    private fun addListFragment(){
        fragmentManager.beginTransaction()
            .add(R.id.container,ListFragment.newInstance())
            .addToBackStack(ListFragment.fragmentTag())
            .commit()
    }

}
