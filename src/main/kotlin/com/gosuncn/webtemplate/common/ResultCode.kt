package com.gosuncn.webtemplate.common

/**
 * 返回码枚举类型
 * Created by hwj on 2017/5/21.
 */
enum class ResultCode(code: Int, message: String) {

    UNKNOW(-99, "未知错误"),
    SUCCESS(1, "操作成功"),
    FAILED(-1, "操作失败");

    var code: Int = code
    var message: String = message

}