package com.example.shop.service

import com.example.shop.repository.UserRepository
import org.springframework.stereotype.Service

@Service
class UserServiceImpl(userRepository: UserRepository) : UserService {
}