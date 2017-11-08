package com.gosuncn.webtemplate.interceptor

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.HandlerInterceptor
import org.springframework.web.servlet.ModelAndView
import java.lang.Exception
import javax.servlet.http.HttpServletRequest
import javax.servlet.http.HttpServletResponse

/**
 * 拦截器(演示)
 * 可在拦截器中对token进行统一验证
 */
@Configuration
class TestInterceptor : HandlerInterceptor {
    var logger: Logger = LoggerFactory.getLogger(this::class.java)
    override fun preHandle(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?): Boolean {
        println("preHandle")

        logger.info("http>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>")
        logger.info("Method={}", request?.method)
        logger.info("RequestURL={}", request?.requestURL)
        logger.info("Protocol={}", request?.protocol)
        logger.info("CharacterEncoding={}", request?.characterEncoding)
        //请求参数
        logger.info("QueryString= {}", request?.queryString)
        logger.info("http<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<")
        return true// 只有返回true才会继续向下执行，返回false取消当前请求
    }

    override fun postHandle(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?, modelAndView: ModelAndView?) {
        println("postHandle")
    }

    override fun afterCompletion(request: HttpServletRequest?, response: HttpServletResponse?, handler: Any?, ex: Exception?) {
        println("afterCompletion")
    }
}