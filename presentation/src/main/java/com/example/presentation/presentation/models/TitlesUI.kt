package com.example.presentation.presentation.models

import com.example.domain.models.Titles
import com.google.gson.annotations.SerializedName

data class TitlesUI(
    @SerializedName("en_jp")
    val enJp: String
)

fun Titles.toUI(): TitlesUI {
    return TitlesUI(enJp)
}
