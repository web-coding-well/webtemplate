package com.gosuncn.webtemplate.web

import org.slf4j.Logger
import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import org.springframework.web.servlet.ModelAndView

@RestController
@RequestMapping(value = "/")
class IndexController {
    var logger: Logger = LoggerFactory.getLogger(this::class.java)

    @GetMapping
    fun indexPage():ModelAndView{
        return ModelAndView("index")
    }
}