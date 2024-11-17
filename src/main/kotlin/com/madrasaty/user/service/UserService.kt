package com.madrasaty.user.service

import com.madrasaty.user.data.repo.LoginRepo
import com.madrasaty.user.data.repo.ParentRepo
import com.madrasaty.user.data.repo.SchoolRepo
import javax.inject.Inject
import javax.inject.Singleton


@Singleton
class UserService(
    @Inject val parentRepo: ParentRepo,
    @Inject val loginRepo: LoginRepo,
    @Inject val schoolRepo: SchoolRepo
){
//    fun signUp()
}