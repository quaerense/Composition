package org.quaerense.composition.domain.repository

import org.quaerense.composition.domain.entity.GameSettings
import org.quaerense.composition.domain.entity.Level
import org.quaerense.composition.domain.entity.Question

interface GameRepository {

    fun generateQuestion(maxSumValue: Int, countOfOptions: Int): Question

    fun getGameSettings(level: Level): GameSettings
}