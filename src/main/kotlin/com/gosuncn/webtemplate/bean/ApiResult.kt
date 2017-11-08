package com.gosuncn.webtemplate.bean

/**
 * 接口统一返回结果
 * Created by hwj on 2017/5/21.
 */
data class ApiResult<T>(
        var code: Int = -1,
        var message: String? = "",
        var data: T? = null) {

    constructor() : this(code = -1, message = "", data = null) {}
}