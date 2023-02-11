package com.example.shop.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToMany

@Entity
data class Account(
    @Id
    @GeneratedValue
    var id: Int,
    var login: String,
    var password: String,
    @ManyToMany
    var books: MutableList<Book>
)
