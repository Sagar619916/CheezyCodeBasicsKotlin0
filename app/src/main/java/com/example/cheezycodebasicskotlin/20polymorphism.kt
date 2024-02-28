package com.example.cheezycodebasicskotlin

fun main(){
   /* val circle : Circle = Circle(4.0)
    val square: Square = Square(4.0)*/
   /**In above code, Inheritance is used, below code we will use polymorphism.
    * Parent Can Hold reference to its child, and called methods of the child classes.-------
    * */
   val circle : Shape = Circle(4.0)
    val square: Shape = Square(4.0)

    //Below will give the Same output, its possible Because of polymorphism-----
    println( circle.area())  // This decides on runtime,which method to call, it will call Circle area,
    // because object is of Circle.
    println( square.area())

    // Advantages of poly---
    val shapes = arrayOf(Circle(3.0), Triangle(3.0,4.0),Square(4.0))

    calculateAreas(shapes) // This will give the ouutput Based on Child classes.

}

// Advantages of polymorpohism ------Later on if any new shape came, like triangle,
// So no neeed to change the Below code, Because we made the Reference of parent class.
// After adding Triangle class, no chnage required in calculateAreas(),
// because we made reference of parent class.
fun calculateAreas(shapes: Array<Shape>){  // Reference of parent Class.
    for(shape in shapes){
        println(shape.area())  // area method has many forms,
    // when we are passing objects of different shapes, thats why its polymorphism.

    }
}

// Declaring open to make it inheritable
open class Shape(){
   open fun area(): Double{
        return 0.0
   }
}

class Circle(val radius: Double) : Shape(){
    override fun area(): Double {
        return Math.PI * radius * radius
    }
}

class Square(val sides: Double) : Shape(){
    override fun area(): Double {
        return sides*sides
    }
}

// Added Triangle class to see advantage of Polymorphism in  calculateAreas()------------

class Triangle (val base: Double, val height: Double): Shape(){
    override fun area(): Double {
        return 0.5 * base * height
    }
}