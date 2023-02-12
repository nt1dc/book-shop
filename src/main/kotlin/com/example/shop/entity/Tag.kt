package com.example.shop.entity

import javax.persistence.*

@Entity
data class Tag(
    @Id
    @GeneratedValue
    var id: Int,
    @Column(unique = true)
    var name: String,
    @ManyToMany
    @JoinTable(
        name = "book_tag",
        joinColumns = arrayOf(JoinColumn(name = "tag_id")),
        inverseJoinColumns = arrayOf(JoinColumn(name = "book_id"))
    )
    var books: MutableSet<Book>
)
