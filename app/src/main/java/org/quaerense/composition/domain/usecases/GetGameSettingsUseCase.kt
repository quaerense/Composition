package org.quaerense.composition.domain.usecases

import org.quaerense.composition.domain.entity.GameSettings
import org.quaerense.composition.domain.entity.Level
import org.quaerense.composition.domain.repository.GameRepository

class GetGameSettingsUseCase(private val repository: GameRepository) {

    operator fun invoke(level: Level): GameSettings {
        return repository.getGameSettings(level)
    }
}