package com.gosuncn.webtemplate.utils

import java.io.BufferedReader
import java.io.FileInputStream
import java.io.InputStreamReader

/**
 * Created by hwj on 2017/5/25.
 */
object FileUtil {

    /**
     * 从文件中读取文本内容
     */
    fun getStringFromPath(path:String):String{
        var br:BufferedReader?= BufferedReader(InputStreamReader(FileInputStream(path),"utf8"))

        var sb=StringBuffer()
        var line:String?=br?.readLine()
        while(line  != null) {
            sb.append(line)
            line=br?.readLine()
        }
        return sb.toString()
    }
}