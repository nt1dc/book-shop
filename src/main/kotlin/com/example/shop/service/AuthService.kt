package com.example.shop.service

import com.example.shop.dto.RegisterDto
import org.springframework.stereotype.Service

@Service
interface AuthService {
    fun register(registerDto: RegisterDto)
}