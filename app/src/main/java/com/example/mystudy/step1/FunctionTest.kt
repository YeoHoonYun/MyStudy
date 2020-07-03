package com.example.mystudy.step1

import com.example.mystudy.TestClass

class FunctionTest(p : (Any) -> Unit) : TestClass(p){
    override fun doTest() {
        funByNoPram()
        funByParameter(31, " 숫자입니다.")
        print(funByReturn("Parameter"))
        println(funByInline(31,10))

        funVar ("Function Variable 1")
        println(funcVarType("Function Variable 2"))

        HigherFunc({ println("Higher Function")})
        HigherFunc(::funByNoPram)
    }

    private val funVar = {s: String -> println(s)}
    var funcVarType : (String) -> Any? = ::funByReturn

    private fun funByReturn(s: String): Any? {
        return s
    }

    private fun funByInline(i: Int, i1: Int) = i * i1

    private fun funByParameter(i: Int, s: String) {
        println(i.toString() + s)
    }

    private fun funByNoPram() {
        println("funByNoParam")
    }

    private fun HigherFunc(f : () -> Unit){
        f()
    }
}