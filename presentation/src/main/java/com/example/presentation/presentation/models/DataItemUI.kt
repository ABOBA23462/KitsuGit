package com.example.presentation.presentation.models

import com.example.domain.models.DataItem
import com.google.gson.annotations.SerializedName

data class DataItemUI(
    @SerializedName("id")
    val id: String,
    @SerializedName("attributes")
    val attributes: AttributesUI,
    @SerializedName("type")
    val type: String
)

fun DataItem.toUI(): DataItemUI {
    return DataItemUI(id, attributes.toUI(), type)
}