package com.example.mikedcares.ui.slider

import androidx.lifecycle.ViewModel
import com.example.mikedcares.data.models.Slider
import com.example.mikedcares.data.repository.SliderRepository

class SliderViewModel : ViewModel() {
    private val sliderRepo = SliderRepository()

    fun getSliderData (): List<Slider> = sliderRepo.getSliderData()
}