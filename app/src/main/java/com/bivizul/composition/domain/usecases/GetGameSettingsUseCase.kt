package com.bivizul.composition.domain.usecases

import com.bivizul.composition.domain.entity.GameSettings
import com.bivizul.composition.domain.entity.Level
import com.bivizul.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(
    private val repository: GameRepository
) {
    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}