package com.gosuncn.webtemplate.common

import com.gosuncn.webtemplate.bean.propertise.CustomPropertise
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.CommandLineRunner
import org.springframework.stereotype.Component

/**
 * 服务启动后执行指定代码,可用于测试时模拟数据加载
 */
@Component
class Startup : CommandLineRunner {
    @Autowired
    lateinit var customPropertise: CustomPropertise
    var logger: Logger = LoggerFactory.getLogger(this::class.java)
    /**
     *  SpringApplication.run执行后会执行下面
     */
    override fun run(vararg args: String?) {
        logger.info("Startup begin")
        logger.info("${customPropertise.firstField}")//print 1

    }
}