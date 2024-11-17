package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Login
import io.quarkus.hibernate.reactive.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
interface LoginRepo: PanacheRepository<Login>