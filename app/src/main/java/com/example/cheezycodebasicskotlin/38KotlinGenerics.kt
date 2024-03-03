package com.example.cheezycodebasicskotlin

fun main(){

    val obj = IntContainer(3)
    obj.getValue()
    //Object of generic classes--
    val iContainer = Container<Int>(3)
    iContainer.getValue()
    val sContainer = Container<String>("Hello")
    sContainer.getValue()
    //collections are generic--
    val list = listOf<Int>(1)

    //vararg use---
    add(1,2,3,2,4,5)
    add(11,1,1,1,1,1,1)
}

//Generic class---
class Container<T>(var data:T){
    fun setValue(value:T){
        data = value
    }
    fun getValue():T{
        return data
    }
}

class IntContainer(var data: Int){
    fun setValue(value:Int){
        data = value
    }
    fun getValue():Int{
        return data
    }
}

class stringContainer(var data: Int){
    fun setValue(value:Int){
        data = value
    }
    fun getValue():Int{
        return data
    }
}

/** vararg means variable number of arrays--
 * */
fun add(vararg values: Int){
    var sum = 0
    for (i in values){
        sum += i
    }
    println(sum)
}