package com.example.cheezycodebasicskotlin

import kotlin.math.pow

fun main(){

    println(sum(2.0,3.0))
    println(power(2.0,3.0))

    //We can assign function into variables--
    var fn: (a: Double, b: Double) -> Double = ::sum
    println(fn(2.0,4.0))

    calculator(5.0,5.0, ::sum)

}

private fun sum(a: Double, b:Double): Double{
    return a+b
}

private fun power(a: Double, b:Double): Double{
    return a.pow(b)
}

/**Higher order function
 * */

private fun calculator(a:Double,b:Double, gn:(Double,Double)-> Double ){
    val result = gn(a,b)
    println(result)
}



