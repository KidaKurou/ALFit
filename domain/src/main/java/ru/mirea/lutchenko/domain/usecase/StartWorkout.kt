package ru.mirea.lutchenko.domain.usecase

import ru.mirea.lutchenko.domain.model.WorkoutProgress
import ru.mirea.lutchenko.domain.repository.IUserRepository

class StartWorkout(private val userRepository: IUserRepository) {
    operator fun invoke(): WorkoutProgress {
        return userRepository.startWorkout()
    }
}