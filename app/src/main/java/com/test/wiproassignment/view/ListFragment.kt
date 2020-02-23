package com.test.wiproassignment.view


import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.test.wiproassignment.R
import com.test.wiproassignment.viewmodel.ListFragmentViewModel

/**
 * A simple [Fragment] subclass.
 */
class ListFragment : Fragment() {

    private lateinit var mListViewModel : ListFragmentViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_list, container, false)
    }

    override fun onResume() {
        super.onResume()
        mListViewModel = ListFragmentViewModel()

    }

    companion object{

        //Instance of ListFragment
        fun newInstance() : ListFragment = ListFragment()

        //TAG of fragment
        fun fragmentTag(): String = ListFragment::class.java.name

    }


}
