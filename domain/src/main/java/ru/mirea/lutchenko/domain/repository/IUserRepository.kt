package ru.mirea.lutchenko.domain.repository

import ru.mirea.lutchenko.domain.model.User
import ru.mirea.lutchenko.domain.model.WorkoutProgress

interface IUserRepository {
    fun register(username: String, password: String): User
    fun login(username: String, password: String): User?
    fun updateUser(user: User): Boolean
    fun startWorkout(): WorkoutProgress
}