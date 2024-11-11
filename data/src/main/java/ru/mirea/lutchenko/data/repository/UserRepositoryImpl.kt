package ru.mirea.lutchenko.data.repository

import ru.mirea.lutchenko.domain.model.User
import ru.mirea.lutchenko.domain.model.WorkoutProgress
import ru.mirea.lutchenko.domain.repository.IUserRepository

class UserRepositoryImpl : IUserRepository {

    private val testUser = User(id = 1, username = "TestUser", password = "password123")

    override fun register(username: String, password: String): User {
        // Return test data
        return testUser.copy(username = username, password = password)
    }

    override fun login(username: String, password: String): User? {
        // Return the test user if the credentials match
        return if (username == testUser.username && password == testUser.password) {
            testUser
        } else {
            null
        }
    }

    override fun updateUser(user: User): Boolean {
        // Simulate an update and return true
        return true
    }

    override fun startWorkout(): WorkoutProgress {
        // Return a dummy workout progress
        return WorkoutProgress(userId = testUser.id, exercisesCompleted = 0)
    }
}
