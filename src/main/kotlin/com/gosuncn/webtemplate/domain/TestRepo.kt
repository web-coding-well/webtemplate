package com.gosuncn.webtemplate.domain

import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface TestRepo: JpaRepository<Test, Long> {
}