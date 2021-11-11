package com.example.notebuilderapp.room_data_source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.notebuilderapp.model.Coin


@Database(
    entities = [Coin::class],
    version = 1
)
abstract class CoinDataBase : RoomDatabase(){

    abstract val coinDao : CoinDao

}