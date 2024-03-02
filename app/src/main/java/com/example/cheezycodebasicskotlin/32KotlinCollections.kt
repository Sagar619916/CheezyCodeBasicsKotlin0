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
    //addAll() to add the element of lists
    nums.addAll(list2)
    println(nums)


    //Maps--
    val students = mutableMapOf<Int, String>()
    students.put(1,"Ryan")
    println(students)
    students.put(2,"John")
    students.put(3,"Katie")
    //get() to get element at position--
    println(students)
    println(students.get(1))
    //If we pass invalid key-- o/p will be null
    println(students.get(11))
    // we can loop also--
    for ((key,value) in students){
        println("$key = $value")
    }

    //ERasy way to put and get--
    students[8]= "Jones"
    println(students[8])

    /** Immutable map can be initialized using "to" operator
     * */
    val map = mapOf<Int, String>(1 to "hello", 2 to "World")
    println(map)
    print(map.entries)

}



