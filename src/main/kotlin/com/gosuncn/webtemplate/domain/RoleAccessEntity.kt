package com.gosuncn.webtemplate.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_role_access")
data class RoleAccessEntity(
        @Id
        var id: Long? = null,
        @Column(name="role_id")
        var roleId:Long?=0,
        @Column(name="access_id")
        var accessId:Long?=0
)