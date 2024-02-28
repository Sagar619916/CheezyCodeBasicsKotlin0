package com.example.cheezycodebasicskotlin

import android.icu.text.AlphabeticIndex.ImmutableIndex

fun main(){
    val nums = mutableListOf(1,2,3)
    println(nums.indexOf(3))
    println(nums.contains(4))
    nums[1] = 2
    println(nums)
    nums.add(5)
    println(nums)
    nums.remove(1)
    println(nums)

    val list2 = listOf(11,12)
    nums.addAll(list2)
    println(nums)


    //Maps--
    
}



