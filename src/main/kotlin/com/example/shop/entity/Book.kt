package com.example.shop.entity

import javax.persistence.*

@Entity
data class Book(
    @Id
    @GeneratedValue
    var id: Int,
    var name: String,
    var description: String,
    @ManyToMany
    @JoinTable(
        name = "account_book",
        joinColumns = [JoinColumn(name = "book_id")],
        inverseJoinColumns = [JoinColumn(name = "account_id")]
    )
    var users: MutableList<User>,
    @ManyToMany
    @JoinTable(
        name = "book_tag",
        joinColumns = [JoinColumn(name = "book_id")],
        inverseJoinColumns = [JoinColumn(name = "tag_id")]
    )
    var tags: MutableSet<Tag>,
    var uploadLink: String,
    @ManyToMany
    @JoinTable(
        name = "book_author",
        joinColumns = [JoinColumn(name = "book_id")],
        inverseJoinColumns = [JoinColumn(name = "author_id")]
    )
    var authors: MutableSet<Author>
)
