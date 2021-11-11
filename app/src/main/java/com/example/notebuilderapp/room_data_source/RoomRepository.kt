package com.example.notebuilderapp.room_data_source

import com.example.notebuilderapp.model.Coin
import kotlinx.coroutines.flow.Flow

class RoomRepository(private val dao: CoinDao) {

    fun getAllCoins() : Flow<List<Coin>>{
        return dao.getAllCoins()
    }

    suspend fun getCoinById(coinId : Int) : Coin? {
        return dao.getCoinById(coinId)
    }

    suspend fun insertCoin(coin:Coin){
        dao.insertCoin(coin)
    }

    suspend fun deleteCoin(coin:Coin) {
        dao.deleteCoin(coin)
    }
}