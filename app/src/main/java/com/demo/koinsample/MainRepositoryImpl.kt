package com.demo.koinsample

class MainRepositoryImpl(private val api: MyApi): MainRepository {

    override fun doNetworkCall() {
        api.callApi()
    }
}