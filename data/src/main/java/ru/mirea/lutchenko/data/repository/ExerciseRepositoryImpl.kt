package ru.mirea.lutchenko.data.repository

import ru.mirea.lutchenko.domain.model.Exercise
import ru.mirea.lutchenko.domain.repository.IExerciseRepository

class ExerciseRepositoryImpl : IExerciseRepository {

    override fun getExercises(): List<Exercise> {
        // Return a list of dummy exercises
        return listOf(
            Exercise(id = 1, name = "Push-Up", description = "A basic push-up exercise"),
            Exercise(id = 2, name = "Squat", description = "A basic squat exercise"),
            Exercise(id = 3, name = "Lunge", description = "A basic lunge exercise")
        )
    }

    override fun getExerciseById(id: Int): Exercise? {
        // Return a dummy exercise based on the ID
        return getExercises().find { it.id == id }
    }
}