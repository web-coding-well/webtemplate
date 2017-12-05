package com.gosuncn.webtemplate.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_user_role")
data class UserRoleEntity(
        @Id
        var id: Long? = null,
        @Column(name="user_id")
        var userId:Long?=0,
        @Column(name="role_id")
        var roleId:Long?=0
)