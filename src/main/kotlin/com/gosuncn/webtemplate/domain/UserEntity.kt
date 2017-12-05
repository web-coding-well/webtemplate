package com.gosuncn.webtemplate.domain

import java.io.Serializable
import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_user")
data class UserEntity(
        @Id
        var id: Long? = null,
        @Column(name="name")
        var name:String?="",
        @Column(name="age")
        var age:Int?= null
):Serializable