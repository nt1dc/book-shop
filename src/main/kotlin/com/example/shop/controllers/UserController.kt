package com.example.shop.controllers

import com.example.shop.service.UserService
import org.springframework.security.core.annotation.AuthenticationPrincipal
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/user")
class UserController(userService: UserService) {
    @GetMapping
    fun zxc(@AuthenticationPrincipal username: String): String {
        return username
    }
}