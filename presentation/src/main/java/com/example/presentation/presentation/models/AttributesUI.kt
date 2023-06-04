package com.example.presentation.presentation.models

import com.example.domain.models.Attributes
import com.google.gson.annotations.SerializedName

data class AttributesUI(
    @SerializedName("posterImage")
    val posterImage: PosterImageUI,
    @SerializedName("titles")
    val titles: TitlesUI
)

fun Attributes.toUI(): AttributesUI {
    return AttributesUI(posterImage.toUI(), titles.toUI())
}