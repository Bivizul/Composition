package com.bivizul.composition.domain.entity

data class GameResult(
    val winner: Boolean,
    val CountOfRightAnswers: Int,
    val countOfQuestion: Int,
    val GameSettings: GameSettings
)