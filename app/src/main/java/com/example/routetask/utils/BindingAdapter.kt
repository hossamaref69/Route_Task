package com.example.routetask.utils

import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

@BindingAdapter("imageUrl")
fun imageUrl(image: ImageView, url: String?) {
    url.let {
        Glide.with(image)
            .load(it)
            .into(image)
    }
}


@BindingAdapter("priceWithEGP")
    fun setPriceWithEGP(view: TextView, price: Double?) {
        if (price != null) {
            view.text = "EGP $price"
        } else {
            view.text = "EGP 0.0"
        }
    }