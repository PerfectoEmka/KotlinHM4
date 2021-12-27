package com.example.kotlinhm5mvvm.view_models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    val counts = MutableLiveData<ArrayList<String>>()

    fun clickCount(list: ArrayList<String>){
        counts.value = list
    }
}