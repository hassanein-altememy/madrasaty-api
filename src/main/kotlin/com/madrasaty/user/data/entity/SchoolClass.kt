package com.madrasaty.user.data.entity

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.OneToMany

@Entity
class SchoolClass {
    @Id
    val name: String?=null
    @OneToMany(cascade = [CascadeType.ALL])
    val students: MutableList<Student> = mutableListOf()
    @OneToMany(cascade = [CascadeType.ALL])
    var teachers: MutableList<Teacher> = mutableListOf()
}
