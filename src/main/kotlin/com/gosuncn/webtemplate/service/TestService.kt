package com.gosuncn.webtemplate.service

import org.springframework.stereotype.Service

@Service
class TestService {


    fun test(content:String):String{
        return "hello:$content"
    }

}