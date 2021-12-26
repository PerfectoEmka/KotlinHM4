package com.example.kotlinhm5mvvm.view_models

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel: ViewModel() {

    val counts = MutableLiveData<ArrayList<String>>()
    private var list = ArrayList<String>()

    fun clickCount(item: String){
        if (item == "+"){
            list.add("+")
        } else {
            list.add("-")
        }
        counts.value = list
    }
}