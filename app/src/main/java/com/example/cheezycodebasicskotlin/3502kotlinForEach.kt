package com.example.cheezycodebasicskotlin

fun main(){
    val nums = listOf(1,2,3,4,5)
    //for printing elements--
    for(i in nums){
        println(i)
    }
    // we have a utility function for this---
    nums.forEach{ println(it) }

}