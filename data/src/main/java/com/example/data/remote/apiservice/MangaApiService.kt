package com.example.data.remote.apiservice

import com.example.data.remote.dtos.DataItemDto
import com.example.data.remote.dtos.ResponseDto
import retrofit2.http.GET

interface MangaApiService {

    @GET("edge/manga")
    suspend fun fetchManga(): ResponseDto<DataItemDto>
}