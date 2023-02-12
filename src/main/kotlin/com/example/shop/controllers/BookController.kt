package com.example.shop.controllers

import com.example.shop.entity.Book
import com.example.shop.service.BookService
import org.springframework.web.bind.annotation.DeleteMapping
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/book")
class BookController(
    val bookService: BookService
) {
    @GetMapping("/{id}")
    fun findBookById(@PathVariable id: Int): Book {
        return bookService.getBookById(id)
    }

    @PostMapping
    fun addBook(book: Book) {
        bookService.addBook(book)
    }

    @DeleteMapping("/{id}")
    fun removeBook(@PathVariable id: Int) {
        bookService.removeBookById(id)
    }
}