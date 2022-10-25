package com.example.mikedcares.ui.slider

import android.os.Bundle
import android.os.PersistableBundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.viewpager.widget.ViewPager
import com.example.mikedcares.data.models.Slider
import com.example.mikedcares.databinding.ActivitySliderBinding
import com.google.android.material.button.MaterialButton
import com.google.android.material.tabs.TabLayout


class SliderActivity : AppCompatActivity() {
    private lateinit var viewModel: SliderViewModel
    private lateinit var binding: ActivitySliderBinding

    // declare variables
    private lateinit var viewPager: ViewPager
    private lateinit var sliderAdapter: SliderAdapter
    private lateinit var sliderList: List<Slider>
    private lateinit var nextButton: MaterialButton
    private lateinit var tabs: TabLayout

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // binding
        binding = ActivitySliderBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Inflate the layout for this fragment

        viewModel = ViewModelProvider(this).get(SliderViewModel::class.java)

        // init variables
        viewPager = binding.sliderPager
        tabs= binding.tabs
        nextButton= binding.button

        // get slider list data
        sliderList = viewModel.getSliderData()

        // adapter
        sliderAdapter = SliderAdapter(this, sliderList)
        viewPager.adapter = sliderAdapter
        tabs.setupWithViewPager(viewPager)

        // click button
        nextButton.setOnClickListener {
            if (viewPager.currentItem < sliderAdapter.count)
                viewPager.currentItem = viewPager.currentItem + 1
        }

        //viewPager
        viewPager.addOnPageChangeListener(getPagerViewListener())
    }

    private fun getPagerViewListener(): ViewPager.OnPageChangeListener {
        var viewListener: ViewPager.OnPageChangeListener = object : ViewPager.OnPageChangeListener {
            override fun onPageScrolled(
                position: Int,
                positionOffset: Float,
                positionOffsetPixels: Int
            ) {
            }

            override fun onPageSelected(position: Int) {
//                if (position == sliderAdapter.count - 1) {
//                    nextButton.text = "get start"
//                } else {
//                    nextButton.text = "next"
//                }

            }

            override fun onPageScrollStateChanged(state: Int) {

            }
        }
        return viewListener
    }
}