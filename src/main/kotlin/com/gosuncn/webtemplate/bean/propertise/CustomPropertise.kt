package com.gosuncn.webtemplate.bean.propertise

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component

@Component
@ConfigurationProperties(prefix = "custom")
data class CustomPropertise (
        var firstField:String="123",
        var secondField:String="456"
)