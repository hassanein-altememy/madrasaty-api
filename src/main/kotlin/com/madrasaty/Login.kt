package com.madrasaty

import java.util.*
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.Id

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