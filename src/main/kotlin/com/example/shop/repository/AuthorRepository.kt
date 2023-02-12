package com.example.shop.repository

import com.example.shop.entity.Author
import org.springframework.data.jpa.repository.JpaRepository

interface AuthorRepository :JpaRepository<Author,Int> {
}