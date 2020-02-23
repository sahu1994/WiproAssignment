package com.test.wiproassignment.model

import android.util.Log
import com.test.wiproassignment.network.RestAPI
import com.test.wiproassignment.utils.BASE_URL
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


/**
 * Class will provide item information
 * @constructor Sets all properties of the item
 * @property title title of item
 * @property description description of item
 * @property imageHref image url of item
 */

data class Item(val title: String, val description: String, val imageHref: String)


class Repository {

    init {
        Thread(Runnable {
            kotlin.run {
                fetchData()
            }
        })
    }

    fun fetchData() {
        provideRetrofitInterface().getListItems()
            .enqueue(object : Callback<MutableList<List<Item>>> {
                override fun onResponse(
                    call: Call<MutableList<List<Item>>>,
                    response: Response<MutableList<List<Item>>>
                ) {
                    val res = response.body();
                    Log.d("Data", res!!.size.toString())
                }

                override fun onFailure(call: Call<MutableList<List<Item>>>?, t: Throwable?) {
                    //
                }


            })
    }


    private fun provideRetrofitInterface(): RestAPI {
        val retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
        return retrofit.create(RestAPI::class.java)
    }


}