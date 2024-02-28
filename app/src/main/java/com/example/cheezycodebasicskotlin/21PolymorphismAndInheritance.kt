package com.example.cheezycodebasicskotlin

fun main(){

    val shape = Shape2()
    printArea(shape) // Output  will be 0.0, bcz We are passing object of Shape2 class.
    val square = Square2(4.0)
    printArea(square) // we can pass Square2 also in printArea() bcz,
                      // Square2 is subclass of Shape2 class.

    // Method calling example-
    val circle = Circle2(4.0)
    println(circle.toString()) // to String method is by default in "Any" class.
}


fun printArea(shape: Shape2){
    println(shape.area())

}

open class Shape2{
    open fun area(): Double = 0.0
    //Method calling example-
    override fun toString(): String {
        return "I am Shape2"
    }
}

class Circle2(val radius: Double): Shape2() {
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square2(val side: Double): Shape2() {
    override fun area(): Double {
        return side * side
    }
}

class Triangle2(val base: Double, val height: Double): Shape2() {
    override fun area(): Double {
        return 0.5 * base * height
    }
}