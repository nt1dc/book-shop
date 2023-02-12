package com.example.shop.repository

import com.example.shop.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import java.util.Optional

interface UserRepository : JpaRepository<User, Int> {
    fun findByLogin(login: String): Optional<User>
}