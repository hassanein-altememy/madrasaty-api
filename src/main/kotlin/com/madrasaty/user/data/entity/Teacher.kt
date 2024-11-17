package com.madrasaty.user.data.entity

import javax.persistence.CascadeType
import javax.persistence.Entity
import javax.persistence.OneToMany

@Entity
class Teacher : Person(){
    @OneToMany(cascade = [CascadeType.ALL])
    val schoolClasses: MutableList<SchoolClass> = mutableListOf()
}