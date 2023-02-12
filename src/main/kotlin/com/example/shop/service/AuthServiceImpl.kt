package com.example.shop.service

import com.example.shop.dto.RegisterDto
import com.example.shop.ecxeption.AlreadyExistsException
import com.example.shop.entity.User
import com.example.shop.repository.UserRepository
import org.springframework.security.crypto.password.PasswordEncoder
import java.security.SecureRandom

class AuthServiceImpl(val userRepository: UserRepository, val passwordEncoder: PasswordEncoder) : AuthService {
    override fun register(registerDto: RegisterDto) {
        val userFromDatabase = userRepository.findByLogin(registerDto.login)
        if (userFromDatabase.isPresent) {
            throw AlreadyExistsException(registerDto.login + "already exist")
        }

    }

    private fun generateSalt(): ByteArray {
        val secureRandom = SecureRandom()
        val salt = ByteArray(16)
        secureRandom.nextBytes(salt)
        return salt
    }

    private fun encodePassword(password: String, salt: ByteArray): ByteArray {
        val withSalt = "$password${salt}"
        val encoded: String = passwordEncoder.encode(withSalt)
        return encoded.toByteArray()
    }


}