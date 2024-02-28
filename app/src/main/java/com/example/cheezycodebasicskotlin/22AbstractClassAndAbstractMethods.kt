package com.example.cheezycodebasicskotlin

fun main(){

    val circle = Circle3(4.0)
    println(circle.area())
    circle.display()
}

abstract class Shape3{
    var name: String = ""
    abstract  fun area() : Double
    abstract fun display()

}

class Circle3(private val radius: Double) : Shape3(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }

    override fun display() {
        println("Circle is getting displayed")
    }
}

// We can Declare a class as abstract without having
// any abstract method or property, to restrict the class from instantiation.
// Below class only be used, if someone will inherit it,
/** If we want to restrict the object creation of any class, and want to make it base class then we make it
 * as abstract, it can only be used when Inherited by some class.
 * */
abstract  class A{
    fun method(){
        println("I am method")
    }
}


