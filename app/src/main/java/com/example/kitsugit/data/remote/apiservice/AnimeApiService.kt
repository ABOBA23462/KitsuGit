package com.example.kitsugit.data.remote.apiservice

import com.example.kitsugit.models.DataItem
import com.example.kitsugit.models.Response
import com.example.kitsugit.models.ResponseDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface AnimeApiService {

    @GET("edge/anime")
    suspend fun fetchAnime(): Response<DataItem>

    @GET("edge/anime/{id}")
    suspend fun fetchDetailAnime(
        @Path("id") id: String
    ): ResponseDetail
}