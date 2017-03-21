package com.diaozhiwei.kotlin

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_kotlin.*

class KotlinActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kotlin)
        text_hello.text=getString(R.string.self_name)
        val myData=DataBean(1,"Aaron")
        button_hello.setOnClickListener { Toast.makeText(this,myData.toString(),Toast.LENGTH_SHORT).show() }
    }
}
