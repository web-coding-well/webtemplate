package com.gosuncn.webtemplate.config

import com.gosuncn.webtemplate.interceptor.TestInterceptor
import com.gosuncn.webtemplate.interceptor.TokenInterceptor
import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.InterceptorRegistry
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter

/**
 * Created by hwj on 2017/6/12.
 */
@Configuration
 class WebSecurityConfig : WebMvcConfigurerAdapter() {


    override fun addInterceptors(registry: InterceptorRegistry?) {
        // super.addInterceptors(registry)
        // 多个拦截器组成一个拦截器链
        // addPathPatterns 用于添加拦截规则
        // excludePathPatterns 用户排除拦截
        //以下拦截器只是示例，用户请根据实际情况添加和修改
        registry!!.addInterceptor(TestInterceptor()).addPathPatterns("/**")
        registry!!.addInterceptor(TokenInterceptor()).addPathPatterns("/**")
        super.addInterceptors(registry)

    }
}