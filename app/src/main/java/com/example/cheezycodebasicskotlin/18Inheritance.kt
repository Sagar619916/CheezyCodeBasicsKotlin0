package com.example.cheezycodebasicskotlin

fun main(){

    val objVidhayak = Vidhayak()
    objVidhayak.myMethod()
    objVidhayak.myMethod2()
}

open class Politician
{
    init { // To check which constructor is called while object creation of child class that is vidhayak.
        println("politician Constructor called")
    }
    val name: String = ""

    fun myMethod(){
        println("I am politician")
    }
}

class Vidhayak : Politician(){

    init { // To check which constructor is called while object creation of child class that is vidhayak.
        println("Vidhayak Constructor called")
    }
    val name2: String = ""

    fun myMethod2(){
        println("I am  Vidhayak")
    }
}
