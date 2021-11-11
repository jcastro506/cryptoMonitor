package com.example.notebuilderapp.room_data_source

import androidx.room.*
import com.example.notebuilderapp.model.Coin
import kotlinx.coroutines.flow.Flow

@Dao
interface CoinDao {

    @Query("SELECT * FROM coin")
    fun getAllCoins() : Flow<List<Coin>>

    @Query("SELECT * FROM coin WHERE id=:coinId")
    suspend fun getCoinById(coinId : Int) : Coin?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertCoin(coin : Coin)

    @Delete
    suspend fun deleteCoin(coin : Coin)

}