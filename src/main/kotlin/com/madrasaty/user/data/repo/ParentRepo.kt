package com.madrasaty.user.data.repo

import com.madrasaty.user.data.entity.Parent
import io.quarkus.hibernate.reactive.panache.kotlin.PanacheRepository
import javax.enterprise.context.ApplicationScoped

@ApplicationScoped
interface ParentRepo: PanacheRepository<Parent>
