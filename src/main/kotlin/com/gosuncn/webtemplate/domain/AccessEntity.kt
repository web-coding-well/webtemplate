package com.gosuncn.webtemplate.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_access")
data class AccessEntity(
        @Id
        var id:Long?=0,
        @Column(name="name")
        var name:String?=""
)