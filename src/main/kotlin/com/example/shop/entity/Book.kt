package com.example.shop.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.ManyToMany

@Entity
data class Book(
    @Id
    @GeneratedValue
    var id: Int,
    var name: String,
    var description: String,
    @ManyToMany
    var accounts: MutableList<Account>
)
