package com.example.kitsugit.data.remote.apiservice

import com.example.kitsugit.models.DataItem
import com.example.kitsugit.models.Response
import com.example.kitsugit.models.ResponseDetail
import retrofit2.http.GET
import retrofit2.http.Path

interface MangaApiService {

    @GET("edge/manga")
    suspend fun fetchManga(): Response<DataItem>

    @GET("edge/manga/{id}")
    suspend fun fetchDetailManga(
        @Path("id") id: String
    ): ResponseDetail
}