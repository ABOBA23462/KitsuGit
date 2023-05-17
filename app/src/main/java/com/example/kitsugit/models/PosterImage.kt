package com.example.kitsugit.models

import com.google.gson.annotations.SerializedName

data class PosterImage(
    @SerializedName("original")
    val original: String,
    @SerializedName("small")
    val small: String,
    @SerializedName("large")
    val large: String,
    @SerializedName("tiny")
    val tiny: String,
    @SerializedName("medium")
    val medium: String
)