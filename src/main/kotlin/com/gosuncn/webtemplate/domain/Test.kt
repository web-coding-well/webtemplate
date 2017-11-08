package com.gosuncn.webtemplate.domain

import javax.persistence.Column
import javax.persistence.Entity
import javax.persistence.Id
import javax.persistence.Table

@Entity
@Table(name = "tb_test")
data class Test(
        @Id
        var id:Long?=null,
        @Column(name="test",nullable = false)
        var test:Long?=null

)