package com.demo.koinsample

import androidx.lifecycle.ViewModel

class MainViewModel(
    private val repository: MainRepository
): ViewModel() {

    fun doNetworkCall() {
        println("Something")
    }
}