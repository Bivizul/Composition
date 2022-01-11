package com.bivizul.composition.domain.entity

import java.io.Serializable

data class GameResult(
    val winner: Boolean,
    val CountOfRightAnswers: Int,
    val countOfQuestion: Int,
    val GameSettings: GameSettings
) : Serializable