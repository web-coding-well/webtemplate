package com.gosuncn.webtemplate.utils

import java.text.SimpleDateFormat


/**
 * Created by hwj on 2017/5/26.
 */
object DateUtil {
    /**
     * 日期格式字符串转换成时间戳
     */
    fun dateStr2TimeStamp(dateStr: String, format: String = "yyyy-MM-dd HH:mm:ss"): Long {
        try {
            val sdf = SimpleDateFormat(format)
            return (sdf.parse(dateStr).time / 1000)
        } catch (e: Exception) {
            e.printStackTrace()
        }
        return 0
    }
}