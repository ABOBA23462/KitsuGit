package com.example.kitsugit.data.remote.apiservice

import com.example.kitsugit.models.DataItem
import com.example.kitsugit.models.Response
import retrofit2.http.GET

interface AnimeApiService {

    @GET("edge/anime")
    suspend fun fetchAnime(): Response<DataItem>
}