package com.gosuncn.webtemplate.bean

/**
 * 仅作示例用,类型必须可为空，因此需要加上?
 */
data class TestResult(
        var userId:Long?=0,
        var name:String?="",
        var age:Int?=0,
        var roleName:String?=""
)