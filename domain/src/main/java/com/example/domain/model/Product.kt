package com.example.domain.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Product (
    val thumbnail: String? = null,
    val rating: Double? = null,
    val description: String? = null,
    val title: String? = null,
    val discountPercentage: Double? = null,
    val price: Double? = null
): Parcelable
