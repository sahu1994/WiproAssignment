package com.test.wiproassignment.network

import com.test.wiproassignment.model.Item
import retrofit2.Call
import retrofit2.http.GET

interface RestAPI {

    /**
     * Get the list of the Items from the API
     */
    @GET("facts.json")
    fun getListItems(): Call<MutableList<List<Item>>>

}