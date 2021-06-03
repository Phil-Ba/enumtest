package at.bayava.repo

import at.bayava.entity.Test
import io.micronaut.data.annotation.Repository
import io.micronaut.data.jpa.repository.JpaRepository
import java.util.*

@Repository
interface TestRepo:JpaRepository<Test,UUID> {
}