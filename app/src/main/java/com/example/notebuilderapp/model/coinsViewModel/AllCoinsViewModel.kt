package com.example.notebuilderapp.model.coinsViewModel

import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.notebuilderapp.data.repository.CoinsRepository
import com.example.notebuilderapp.model.Coin
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class AllCoinsViewModel(private val repository: CoinsRepository = CoinsRepository()) : ViewModel() {

    init {
        viewModelScope.launch(Dispatchers.IO) {
            var coins = repository.getAllCoins()
            allCoins.value = coins
        }
    }

    var allCoins : MutableState<List<Coin>> = mutableStateOf(emptyList<Coin>())

}