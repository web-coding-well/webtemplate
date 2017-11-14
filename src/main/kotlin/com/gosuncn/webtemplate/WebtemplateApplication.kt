package com.gosuncn.webtemplate

import com.google.gson.Gson
import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.ApplicationContext
import org.springframework.context.annotation.Bean

@SpringBootApplication
class WebtemplateApplication {

    companion object {
        var logger: Logger = LoggerFactory.getLogger(this::class.java)
        @JvmStatic
        fun main(args: Array<String>) {
            logger.info("SpringApplication begin")
            var applicationContext: ApplicationContext = SpringApplication.run(WebtemplateApplication::class.java, *args)
            logger.info("SpringApplication end")

        }
    }


    @Bean
    fun gson(): Gson {
        return Gson()
    }

}
