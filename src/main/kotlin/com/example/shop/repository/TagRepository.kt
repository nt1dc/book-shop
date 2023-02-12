package com.example.shop.repository

import com.example.shop.entity.Tag
import org.springframework.data.jpa.repository.JpaRepository

interface TagRepository : JpaRepository<Tag, Int> {
}