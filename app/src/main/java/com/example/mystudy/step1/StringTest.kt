package com.example.mystudy.step1

import com.example.mystudy.TestClass
import java.util.*

class StringTest( p : (Any) -> Unit ) : TestClass(p){
    override fun doTest() {
        var sName = "박모씨"
        println (sName + " - The Gamer")

        var sLines = """
            1
            2
            3
            4
            5
            6
            7
            8
            9
        """
        println(sLines)

        var sFormatter = "$sName <--- sName의 값"
        println(sFormatter)

        var sBash = "${ "지금시각은 - " + Date()}"
        println(sBash)
    }
}