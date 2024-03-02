package com.example.cheezycodebasicskotlin

fun main() {
    var fn: (a: Int, b: Int) -> Int = ::sum

    //Simple lambda---
    val lambda1 = { x: Int, y: Int -> x + y }
    // Inside lambda the last line is always return type
    val multilineLambda = {
        println("Hello lambda")
        val a = 2 + 3
        "Hello cheezy code"
        2
    }
    multilineLambda()
    println(multilineLambda())

    val singleParam = { x: Int -> x * x }
    val lambda2: (Int) -> Int = { x -> x * x }

    val sayHi = { msg: String -> println("Hello $msg") }
    val sayHi2: (String) -> Unit = { msg: String -> println("Hello $msg") }

    val singleParam2: (Int) -> Int = { x -> x + x }
    val simplifySingleParam2: (Int) -> Int = { it + it } // "it" Points to single parameter

    // Whenever lambda parameter is last parameter, we can write it outside function also---
    calculator(1,2) { a, b -> a + b }
}
private fun sum(a:Int, b:Int): Int = a+b

private fun calculator(a:Int, b: Int, op:(Int,Int)-> Int): Int {
    return op(a,b)
}

