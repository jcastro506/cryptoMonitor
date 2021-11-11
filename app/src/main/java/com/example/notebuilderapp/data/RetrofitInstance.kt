package com.example.notebuilderapp.data

import com.example.notebuilderapp.constants.Constants.BASE_URL
import retrofit2.converter.gson.GsonConverterFactory

import retrofit2.Retrofit

object RetrofitInstance {

        var retrofit: Retrofit = Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()

        var api : CryptoApiCalls = retrofit.create(CryptoApiCalls::class.java)

}