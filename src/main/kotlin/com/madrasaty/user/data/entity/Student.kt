package com.madrasaty.user.data.entity

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Student : Person() {
    @OneToMany(cascade = [CascadeType.ALL])
    val parents: MutableList<Parent> = mutableListOf()
}