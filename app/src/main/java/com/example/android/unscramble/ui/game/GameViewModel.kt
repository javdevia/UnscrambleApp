package com.example.android.unscramble.ui.game

import android.util.Log
import androidx.lifecycle.ViewModel

class GameViewModel : ViewModel() {

    init {
        Log.d("GameFragment", "GameViewModel created!")
    }
    private var _count = 0
    public val count: Int get() = _count

    private var _currentScrambleWord = "Test"
    public val currentScrambleWord: String get() = _currentScrambleWord

    private var _score = 0
    public val score: Int get() = _score

    override fun onCleared(){
        super.onCleared()
        Log.d("GameFragment", "GameViewModel destroyed!")
    }

    
}