package com.bivizul.composition.domain.entity

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class  GameResult(
    val winner: Boolean,
    val CountOfRightAnswers: Int,
    val countOfQuestion: Int,
    val GameSettings: GameSettings
) : Parcelable