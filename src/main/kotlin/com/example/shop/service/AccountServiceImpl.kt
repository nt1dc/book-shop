package com.example.shop.service

import com.example.shop.repository.AccountRepository
import org.springframework.stereotype.Service

@Service
class AccountServiceImpl(accountRepository: AccountRepository) : AccountService {
}