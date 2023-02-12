package com.example.shop.entity

import javax.persistence.*

@Entity
data class Account(
    @Id
    @GeneratedValue
    var id: Int,
    @Column(unique = true)
    var login: String,
    var password: String,
    @ManyToMany
    @JoinTable(
        name = "account_book",
        joinColumns = [JoinColumn(name = "account_id")],
        inverseJoinColumns = [JoinColumn(name = "book_id")]
    )
    private var books: MutableList<Book>,
    @ManyToMany
    @JoinTable(
        name = "account_role",
        joinColumns = [JoinColumn(name = "account_id")],
        inverseJoinColumns = [JoinColumn(name = "role_id")]
    )
    var roles: MutableSet<Role>
)
