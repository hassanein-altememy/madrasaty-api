package com.madrasaty.user.data.entity

import java.util.UUID
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.ManyToOne
import javax.persistence.Id
import javax.persistence.Table

@Entity
class Login (
    @Id
    @GeneratedValue
    val id: UUID?=null,

    @Column(nullable = false)
    var loginName: String,

    @Column(nullable = false)
    var password: String,

    @Column(nullable = false)
    var active: Boolean
)