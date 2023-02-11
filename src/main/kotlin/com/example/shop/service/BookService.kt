package com.example.shop.service

import com.example.shop.entity.Book
import org.springframework.stereotype.Service

@Service
interface BookService {
    fun getBookById(id:Int): Book
    fun addBook(book: Book)
    fun removeBookById(id: Int)
}