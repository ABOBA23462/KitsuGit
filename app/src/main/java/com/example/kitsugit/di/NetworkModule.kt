package com.example.kitsugit.di

import com.example.data.remote.RetrofitClient
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Singleton
    val retrofitClient = RetrofitClient()

    @Singleton
    @Provides
    fun provideAnimeApiService() = retrofitClient.provideAnimeApiService()

    @Singleton
    @Provides
    fun provideMangaApiService() = retrofitClient.provideMangaApiService()
}