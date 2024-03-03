package com.example.cheezycodebasicskotlin

fun main(){

    val obj = Outer()
    obj.i

    //Object of nested class---
   /* val  nested = Outer.Nested()
    nested.test()*/

    val inner = Outer().Nested()
    inner.test()
}

class Outer{
    var i = 0
    // Nested class
   inner class Nested{
        fun test(){
            println("I am in nested class $i")
        }
    }
}