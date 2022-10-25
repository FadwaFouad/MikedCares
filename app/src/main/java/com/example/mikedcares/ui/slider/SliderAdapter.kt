package com.example.mikedcares.ui.slider

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.viewpager.widget.PagerAdapter
import com.example.mikedcares.R
import com.example.mikedcares.data.models.Slider

class SliderAdapter (private val context : Context, private val sliderList : List<Slider>) : PagerAdapter() {

    override fun getCount(): Int = sliderList.size
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view === `object` as ConstraintLayout
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val layoutInflater: LayoutInflater =
            context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
        val view: View = layoutInflater.inflate( R.layout.layout_slider, container, false)

        val image  = view.findViewById<ImageView>(R.id.slider_image)
        val title  = view.findViewById<TextView>(R.id.slider_title)
        val desc  = view.findViewById<TextView>(R.id.slider_desc)

        val sliderData: Slider = sliderList.get(position)
        title.text = sliderData.title
        desc.text = sliderData.description
        image.setImageResource(sliderData.image)

        container.addView(view)
        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as ConstraintLayout)
    }
}