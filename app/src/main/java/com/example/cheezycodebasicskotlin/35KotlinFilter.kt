package com.example.cheezycodebasicskotlin

fun main(){

    val nums = listOf(1,2,3,4,5)
    println(isOdd(3))
    println(isOdd(2))

    val list = nums.filter(::isOdd)
    println(list)
    //Another way--
    val list2 = nums.filter { a: Int -> a % 2 != 0 }
    println(list2)
    //More modification--
    val list3 = nums.filter { it%2 !=0}
    println(list3)

    // oNE More use of filter()----
    val userList = listOf(
        User(1,"A"),
        User(2,"B"),
        User(3,"C"),
        User(4,"D")
    )
    println(userList.filter { it.id == 2 })
}

private fun isOdd(a:Int): Boolean {
    return a%2  != 0
}

private data class User(val id:Int, val name:String)

