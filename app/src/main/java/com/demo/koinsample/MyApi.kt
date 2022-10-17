package com.demo.koinsample

import retrofit2.http.GET

interface MyApi {

    @GET("/endpointTest")
    fun callApi()
}