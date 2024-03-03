package com.example.cheezycodebasicskotlin

fun main(){
    val nums = listOf(1,2,3,4,5)
    val list = nums.map { it*it }
    println(list)

    val userList = listOf(
        User2(1,"A"),
        User2(2,"B"),
        User2(3,"C"),
        User2(4,"D")
    )
    val paidUserList = userList.map{
        PaidUser(it.id,it.name,"Paid")
    }

    println(paidUserList)
}

private data class User2(val id:Int,val name:String)
data class PaidUser(val id:Int, val name:String, val type:String)