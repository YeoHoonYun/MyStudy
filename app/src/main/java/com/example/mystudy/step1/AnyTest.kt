package com.example.mystudy.step1

import com.example.mystudy.TestClass

class AnyTest(p : (Any) -> Unit) : TestClass(p) {
    override fun doTest() {
        var everybody : Any

        everybody = 1111
        everybody = "문제열 테스트"
        everybody = 211.01010
        everybody = 12.00f

        if(everybody !is String){
            if(everybody is Float){
                println("Float입니다.")
            }
        }

        println(everybody == 12.00f)
        println(everybody.equals(12.00f))
    }
}