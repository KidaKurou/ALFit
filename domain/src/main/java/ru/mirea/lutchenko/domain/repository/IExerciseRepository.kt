package ru.mirea.lutchenko.domain.repository

import ru.mirea.lutchenko.domain.model.Exercise

interface IExerciseRepository {
    fun getExercises(): List<Exercise>
    fun getExerciseById(id: Int): Exercise?
}