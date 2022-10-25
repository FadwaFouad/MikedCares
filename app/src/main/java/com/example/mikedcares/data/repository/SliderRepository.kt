package com.example.mikedcares.data.repository

import com.example.mikedcares.R
import com.example.mikedcares.data.models.Slider


class SliderRepository {
    private val sliderData =
        listOf<Slider>(
            Slider(
                "Make a Live Consultation with Top Therapist",
                "Our Excitement to serve drives us to exceed our client's expectation every time",
                R.drawable.therapist_icon
            ),
            Slider(
                "Best Maternal and Perinatal Mental Health Therapy",
                "Providing effective assistance for women is essential to help them thrive",
                R.drawable.mental_icon
            ),
        )


    fun getSliderData() = sliderData

}
