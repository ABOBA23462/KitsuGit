package com.example.kitsugit.models

import com.google.gson.annotations.SerializedName

data class ResponseDetail(
    @SerializedName("data")
    val data: DataItem
)