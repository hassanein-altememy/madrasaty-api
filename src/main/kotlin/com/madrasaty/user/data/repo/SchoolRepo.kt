package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Person
import io.quarkus.hibernate.reactive.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
interface SchoolRepo: PanacheRepository<Person>