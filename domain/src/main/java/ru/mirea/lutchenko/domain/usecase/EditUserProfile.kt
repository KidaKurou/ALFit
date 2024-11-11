package ru.mirea.lutchenko.domain.usecase

import ru.mirea.lutchenko.domain.model.User
import ru.mirea.lutchenko.domain.repository.IUserRepository

class EditUserProfile(private val userRepository: IUserRepository) {
    operator fun invoke(user: User): Boolean {
        return userRepository.updateUser(user)
    }
}