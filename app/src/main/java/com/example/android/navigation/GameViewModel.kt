package com.example.android.navigation

import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel(){
    private var _gamesCompleted = 0
    private var _gamesWon = 0
    val gamesCompleted: Int
        get() = _gamesCompleted
    val gamesWon: Int
        get() = _gamesWon

    override fun toString(): String {
        return "played: $_gamesCompleted, won: $_gamesWon)"
    }

    fun onGameFinished(won: Boolean) {
        _gamesCompleted++
        if (won) _gamesWon++
    }
}