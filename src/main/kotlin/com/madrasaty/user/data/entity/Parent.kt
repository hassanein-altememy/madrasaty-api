package com.madrasaty.user.data.entity

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Parent : Person() {
    @OneToMany(cascade = [CascadeType.ALL])
    val children: MutableList<Student> = mutableListOf()
}