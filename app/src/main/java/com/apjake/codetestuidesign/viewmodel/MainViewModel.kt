package com.apjake.codetestuidesign.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.apjake.codetestuidesign.helper.TravelListGenerator
import com.apjake.codetestuidesign.model.Travel

class MainViewModel: ViewModel() {
    val travelList= MutableLiveData<List<Travel>>()
    init {
        travelList.postValue(TravelListGenerator.generate())
    }
}