package com.example.mystudy.step1

import com.example.mystudy.TestClass

class FirstTest (p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        println("종결자(;)없어도 됩니다.")
        println("var는 읽기 쓰기. val은 읽기전용")
        var nCount : Int = 0
        var name = "psw"

        val age = 0

        var MyMoney : Int? = null

        var message ="위에서는 액세스 불가함"

        println(hiMessage)
    }
    var hiMessage : String = "hi"
}