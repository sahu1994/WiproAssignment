package com.test.wiproassignment.viewmodel

import android.util.Log
import com.test.wiproassignment.base.BaseViewModel
import com.test.wiproassignment.model.Repository

class ListFragmentViewModel : BaseViewModel() {


    init {
        val mRepository = Repository()
        Log.d("Data", mRepository.fetchData().toString())
    }

}