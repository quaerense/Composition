package org.quaerense.composition.domain.usecases

import org.quaerense.composition.domain.entity.Question
import org.quaerense.composition.domain.repository.GameRepository

class GenerateQuestionUseCase(private val repository: GameRepository) {

    operator fun invoke(maxSumValue: Int): Question {
        return repository.generateQuestion(maxSumValue, COUNT_OF_OPTIONS)
    }

    private companion object {
        private const val COUNT_OF_OPTIONS = 6
    }
}