package com.example.shop.entity

import javax.persistence.*

@Entity
data class Author(
    @Id
    @GeneratedValue
    var id: Int,
    var name: String,
    @ManyToMany
    @JoinTable(
        name = "book_tag",
        joinColumns = [JoinColumn(name = "author_id")],
        inverseJoinColumns = [JoinColumn(name = "book_id")]
    )
    var books: MutableSet<Book>
)
