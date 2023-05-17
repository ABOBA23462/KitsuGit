package com.example.kitsugit.data.remote.apiservice

import com.example.kitsugit.models.DataItem
import com.example.kitsugit.models.Response
import retrofit2.http.GET

interface MangaApiService {

    @GET("edge/manga")
    suspend fun fetchManga(): Response<DataItem>
}