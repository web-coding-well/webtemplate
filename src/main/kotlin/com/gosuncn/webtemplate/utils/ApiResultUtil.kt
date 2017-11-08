package com.gosuncn.webtemplate.utils

import com.gosuncn.webtemplate.bean.ApiResult
import com.gosuncn.webtemplate.common.ResultCode


/**
 * Created by hwj on 2017/6/9.
 */
object ApiResultUtil {
    fun <T> success(data: T?): ApiResult<T> {
        var result = ApiResult<T>(ResultCode.SUCCESS.code,ResultCode.SUCCESS.message,data)
        return result
    }

    fun  success(): ApiResult<String> {
        return success("")
    }

    fun  failed(): ApiResult<String> {
        val result = ApiResult<String>(ResultCode.FAILED.code,ResultCode.FAILED.message,"")
        return result
    }


    fun  failed(message: String): ApiResult<String> {
        val result = ApiResult<String>(ResultCode.FAILED.code,message,"")
        return result
    }

    fun <T> failed(message: String,t:T): ApiResult<T> {
        val result = ApiResult<T>(ResultCode.FAILED.code,message,t)
        return result
    }

    fun  error(errorCode: Int, message: String?): ApiResult<String> {
        val result = ApiResult<String>(errorCode,message,"")
        return result
    }

    fun <T> error(errorCode: Int, message: String, data: T): ApiResult<T> {
        val result = ApiResult<T>(errorCode,message,data)
        return result
    }
}