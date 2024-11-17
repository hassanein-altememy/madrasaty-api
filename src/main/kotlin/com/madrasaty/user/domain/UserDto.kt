package com.madrasaty.user.domain

import java.util.*

data class UserLoginDto(
    val personId: UUID,
    val firstName: String,
    val lastName: String,
    val role: Role
)

enum class Role {
    STUDENT, PARENT, TEACHER, ADMIN
}