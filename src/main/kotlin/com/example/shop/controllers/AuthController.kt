package com.example.shop.controllers

import com.example.shop.dto.RegisterDto
import com.example.shop.service.AuthService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RequestMapping("/auth")
@RestController
class AuthController(val authService: AuthService) {
    @PostMapping("/register")
    fun register(registerDto: RegisterDto) {
        authService.register(registerDto)
    }
}