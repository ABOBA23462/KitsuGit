package com.example.presentation.presentation.models

import com.example.domain.models.PosterImage
import com.google.gson.annotations.SerializedName

data class PosterImageUI(
    @SerializedName("original")
    val original: String,
    @SerializedName("large")
    val large: String
)

fun PosterImage.toUI(): PosterImageUI {
    return PosterImageUI(original, large.toString())
}