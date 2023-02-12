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
    var accounts: MutableList<Account>,
    @ManyToMany
    @JoinTable(
        name = "book_tag",
        joinColumns = [JoinColumn(name = "book_id")],
        inverseJoinColumns = [JoinColumn(name = "tag_id")]
    )
    var tags: MutableSet<Tag>
)
