package com.example.shop.service

import com.example.shop.entity.Book
import com.example.shop.repository.BookRepository
import org.springframework.stereotype.Service

@Service
class
BookServiceIml(
    var bookRepository: BookRepository
) : BookService {

    override fun getBookById(id: Int): Book {
        return bookRepository.findById(id).get();
    }

    override fun addBook(book: Book) {
        bookRepository.save(book)
    }

    override fun removeBookById(id: Int) {
        bookRepository.deleteById(id);
    }

    override fun getAllBooks(): MutableList<Book> {
        return bookRepository.findAll()
    }
}