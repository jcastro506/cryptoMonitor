package com.example.notebuilderapp.data.repository

import com.example.notebuilderapp.data.CryptoApiCalls
import com.example.notebuilderapp.data.RetrofitInstance
import com.example.notebuilderapp.model.AllCoins

class CoinsRepository() {

    suspend fun getAllCoins(): AllCoins {
        return RetrofitInstance.api.getAllCoins()
    }
}