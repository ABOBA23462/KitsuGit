package com.example.kitsugit.models

import com.google.gson.annotations.SerializedName

data class Attributes(
    @SerializedName("endDate")
    val endDate: String,
    @SerializedName("episodeCount")
    val episodeCount: Int,
    @SerializedName("ratingRank")
    val ratingRank: Int,
    @SerializedName("posterImage")
    val posterImage: PosterImage,
    @SerializedName("createdAt")
    val createdAt: String,
    @SerializedName("subtype")
    val subtype: String,
    @SerializedName("youtubeVideoId")
    val youtubeVideoId: String,
    @SerializedName("averageRating")
    val averageRating: String,
    @SerializedName("showType")
    val showType: String,
    @SerializedName("abbreviatedTitles")
    val abbreviatedTitles: List<String>?,
    @SerializedName("slug")
    val slug: String,
    @SerializedName("episodeLength")
    val episodeLength: Int,
    @SerializedName("updatedAt")
    val updatedAt: String,
    @SerializedName("synopsis")
    val synopsis: String,
    @SerializedName("titles")
    val titles: Titles,
    @SerializedName("ageRating")
    val ageRating: String,
    @SerializedName("favoritesCount")
    val favoritesCount: Int,
    @SerializedName("coverImageTopOffset")
    val coverImageTopOffset: Int,
    @SerializedName("canonicalTitle")
    val canonicalTitle: String,
    @SerializedName("tba")
    val tba: String,
    @SerializedName("userCount")
    val userCount: Int,
    @SerializedName("popularityRank")
    val popularityRank: Int,
    @SerializedName("ageRatingGuide")
    val ageRatingGuide: String,
    @SerializedName("startDate")
    val startDate: String,
    @SerializedName("status")
    val status: String,
    @SerializedName("chapterCount")
    val chapterCount: Int
)
