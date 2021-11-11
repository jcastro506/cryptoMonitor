package com.example.notebuilderapp.model


import androidx.room.Entity
import androidx.room.PrimaryKey
import com.google.gson.annotations.SerializedName

@Entity
data class Coin(
    @PrimaryKey
    @SerializedName("id")
    val id: String,
    @SerializedName("is_active")
    val isActive: Boolean,
    @SerializedName("is_new")
    val isNew: Boolean,
    @SerializedName("name")
    val name: String,
    @SerializedName("rank")
    val rank: Int,
    @SerializedName("symbol")
    val symbol: String,
    @SerializedName("type")
    val type: String
)