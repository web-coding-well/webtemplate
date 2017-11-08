package com.gosuncn.webtemplate.common

import com.gosuncn.webtemplate.bean.ApiResult
import com.gosuncn.webtemplate.utils.ApiResultUtil
import org.slf4j.LoggerFactory
import org.springframework.dao.DataIntegrityViolationException
import org.springframework.dao.EmptyResultDataAccessException
import org.springframework.web.HttpRequestMethodNotSupportedException
import org.springframework.web.bind.MissingServletRequestParameterException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.method.annotation.MethodArgumentTypeMismatchException
import javax.servlet.http.HttpServletRequest


/**
 * 异常处理器，捕获所有异常，并按照统一格式返回
 * Created by hwj on 2017/5/21.
 */
@ControllerAdvice
class ExceptionHandler {
    val logger = LoggerFactory.getLogger(this.javaClass)

    @org.springframework.web.bind.annotation.ExceptionHandler(value = Exception::class)
    @ResponseBody
    fun  handle(request: HttpServletRequest, e: Exception): ApiResult<String> {

       when(e){
           is HttpRequestMethodNotSupportedException  ->  return ApiResultUtil.error(-1,"请求方式(Get/Post)错误","HttpRequestMethodNotSupportedException")
           is MissingServletRequestParameterException ->  return ApiResultUtil.error(-1,"缺少参数","MissingServletRequestParameterException")
           is MethodArgumentTypeMismatchException ->  return ApiResultUtil.error(-1,"参数类型错误","MethodArgumentTypeMismatchException")
           is EmptyResultDataAccessException ->  return ApiResultUtil.error(-1,"数据库不存在此记录","EmptyResultDataAccessException")
           is DataIntegrityViolationException ->  return ApiResultUtil.error(-1,"Insert或Update数据时违反了完整性，例如违反了惟一性限制,请检查参数内容是否合法 ","DataIntegrityViolationException")
           is BusinessException ->return ApiResultUtil.error(e.code, e.message)
       }
        e.printStackTrace()
        logger.error("系统异常:" + e.javaClass)
        return ApiResultUtil.error(-1, "未知错误", e.javaClass.toString())
    }
}