package com.example.cheezycodebasicskotlin

fun main(){

    val oneplus = OnePlus("SmartPhone")
    println(oneplus.toString()) // Checking any class override output
    oneplus.display()
    oneplus.powerOff() // This will eecute parent method then chil println()............
    oneplus.powerOff()
    val mobile = Mobile("General")
    mobile.display()
}

open class Mobile(val type:String){
    open val name: String = "Normal phone"
   open val size: Int = 5
    fun makeCall() = println("Calling from Mobile")
   open fun powerOff() = println("Shutting down")
   open fun display() = println("Simple Mobile Display")
}

class OnePlus(typeParam: String): Mobile(typeParam){
    override fun display() = println("One Plus display")
    override val name: String = "One plus"
    override val size: Int = 6

    //If we want to run parent class functionality and override it also then--

    override fun powerOff(){
        println("Name: ${super.name}")
        super.display()
        display()  // This will take child overriden function
        super.powerOff() // This will execute the parent function , then we will write our code
        println("Shutting down One plus")
    }

    // By default method---
    /* override fun toString(): String {
        return super.toString()
    }*/

// Overriding the Methods of "ANY" Class--
    override fun toString(): String {
        return "Name - $name Size - $size"
    }


}