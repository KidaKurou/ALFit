package ru.mirea.lutchenko.domain.usecase

import ru.mirea.lutchenko.domain.model.User
import ru.mirea.lutchenko.domain.repository.IUserRepository

class RegisterUser(private val userRepository: IUserRepository) {
    operator fun invoke(username: String, password: String): User {
        return userRepository.register(username, password)
    }
}