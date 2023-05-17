package com.example.kitsugit.base

import com.example.kitsugit.utils.Resource
import kotlinx.coroutines.flow.flow

abstract class BaseRepository {

    fun <T> doRequest(request: suspend () -> T) = flow {
        emit(Resource.Loading())
        try {
            emit(Resource.Success(request()))
        } catch (exception: Exception) {
            emit(Resource.Error(exception.localizedMessage ?: "Error", null))
        }
    }
}