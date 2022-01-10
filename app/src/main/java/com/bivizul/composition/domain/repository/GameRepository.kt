package com.bivizul.composition.domain.repository

import com.bivizul.composition.domain.entity.GameSettings
import com.bivizul.composition.domain.entity.Level
import com.bivizul.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(
        maxSumValue: Int,
        countOfOptions: Int
    ): Question

    fun getGameSettings(level: Level): GameSettings
}