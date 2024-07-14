package com.example.data.models

data class Review(
    val rating: Double,
    val comment: String,
    val date: String,
    val reviewerName: String,
    val reviewerEmail: String
)
