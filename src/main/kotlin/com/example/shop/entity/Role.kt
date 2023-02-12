package com.example.shop.entity

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.JoinColumn
import javax.persistence.JoinTable
import javax.persistence.ManyToMany

@Entity
data class Role(
    @Id @GeneratedValue var id: Int,
    var name: String,
    @ManyToMany
    @JoinTable(
        name = "account_role",
        joinColumns = [JoinColumn(name = "role_id")],
        inverseJoinColumns = [JoinColumn(name = "account_id")]
    )
    var accounts: MutableSet<Account>
)
