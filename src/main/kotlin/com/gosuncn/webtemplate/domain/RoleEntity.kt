package com.gosuncn.webtemplate.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_role")
data class RoleEntity(
        @Id
        var id: Long? = 0,
        @Column(name="name")
        var name: String? = ""
)