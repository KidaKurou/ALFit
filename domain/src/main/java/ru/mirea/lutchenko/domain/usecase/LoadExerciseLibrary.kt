package ru.mirea.lutchenko.domain.usecase

import ru.mirea.lutchenko.domain.model.Exercise
import ru.mirea.lutchenko.domain.repository.IExerciseRepository

class LoadExerciseLibrary(private val exerciseRepository: IExerciseRepository) {
    operator fun invoke(): List<Exercise> {
        return exerciseRepository.getExercises()
    }
}