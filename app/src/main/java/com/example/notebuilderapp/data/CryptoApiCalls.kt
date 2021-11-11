package com.example.notebuilderapp.data

import com.example.notebuilderapp.model.AllCoins
import retrofit2.http.GET

interface CryptoApiCalls {

    @GET("coins")
    suspend fun getAllCoins() : AllCoins

}