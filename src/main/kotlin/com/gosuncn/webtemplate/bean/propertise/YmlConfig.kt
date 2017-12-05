package com.gosuncn.webtemplate.bean.propertise

import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.stereotype.Component
import java.util.HashMap
import groovy.transform.ToString
import groovy.transform.EqualsAndHashCode


@Component
@ConfigurationProperties(prefix = "prairieManage")
@EqualsAndHashCode
@ToString
class YmlConfig {
    var mapProps = HashMap<String, String>()
}