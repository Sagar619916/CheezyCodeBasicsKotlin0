package com.example.cheezycodebasicskotlin

fun main(){

    println("Hello Cheezy Code".formattedString())

    calculateTimeAndRun {
        loop(1000000)
    }

}

/**Extension Function---
 *
 *
 * Note -- we cannot access private member of class inside extension function.
 * */

fun String.formattedString(): String {
    return "----------\n$this\n----------"
    //here this will point to "Hello Cheezy Code"
    // this means current object
}

/**Inline function--
 * */

 inline fun calculateTimeAndRun(fn: ()-> Unit){
    val start = System.currentTimeMillis()
    fn()
    val end = System.currentTimeMillis()
    println("Time taken ${end-start} ms")

}

fun loop(n:Long){
    for (i in 1..n){
        //
    }
}


