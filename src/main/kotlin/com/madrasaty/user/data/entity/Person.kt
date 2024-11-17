package com.madrasaty.user.data.entity

import java.util.*
import javax.persistence.CascadeType
import javax.persistence.GeneratedValue
import javax.persistence.Id
import javax.persistence.MappedSuperclass
import javax.persistence.OneToMany

@MappedSuperclass
abstract class Person {
    @Id
    @GeneratedValue
    val id: UUID?=null

    var firstName: String?=null

    var lastName: String?=null

    var birthday: Date?=null

    var address: String?=null

    @OneToMany(cascade = [CascadeType.ALL])
    val logins: MutableList<Login> = mutableListOf()

}