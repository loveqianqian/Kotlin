package com.diaozhiwei.kotlin

import java.io.Serializable

/**
 * Created by zhiwei on 2017/3/21.
 */
data class DataBean  (var code:Int,var name :String ) :Serializable{

    override fun toString(): String {
        return "my code : ${code}, my name : ${name}"
    }
}