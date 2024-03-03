package com.example.cheezycodebasicskotlin

fun main(){
    val emp = Employee()
    emp.age = 20
    emp.name = "John"

    // For repetetive work--
    var x = emp.apply {
        age = 30
        name = "Shawn"
    }
    println(x)

    //To print properties--
    println(emp.age)
    println(emp.name)

    emp.let {
        println(it.name)
        println(it.age) //last statement is its return type
        2
    }

    emp.let {
        it.age = 30
        it.name = "Cena"
    }
    //To improve this repeated "it"----we have "with"-----
    with(emp){
        age = 30
        name = "xyz" //last expression value is return value--
    }

    // run---combination of let and with--
    emp.run {
        age = 35
        name = "pegcg" // last value is return
    }

}

data class Employee(var name: String="", var age:Int= 18)
