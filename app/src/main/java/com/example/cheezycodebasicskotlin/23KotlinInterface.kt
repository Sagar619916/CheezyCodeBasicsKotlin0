package com.example.cheezycodebasicskotlin

fun main(){

    dragObjects(arrayOf(Circle4(4.0), Square4(4.0), Triangle4(2.0,3.0), Player("Smiley")))
}

fun dragObjects(objects: Array<Draggable>){  // Polymorphism working here,
// Reference is of Parent Class, but objects inside is of child classes.
    for(obj in objects){
        obj.drag()
    }
}

interface Draggable{
  /*  val dragSpeed: Int*/  // We can define properties as well inside interfaces.
    fun drag()
}



abstract class Shape4 : Draggable {  // We can implement multiple interfaces
    abstract fun area(): Double

}

class Circle4(val radius: Double): Shape4(){
    override fun area(): Double = Math.PI * radius *  radius
    override fun drag() = println("Circle is dragging")
}

class Square4(val side: Double): Shape4(){
    override fun area(): Double = side * side
    override fun drag() = println("Square is dragging")
}

class Triangle4(val base: Double, val height: Double): Shape4(){
    override fun area(): Double = 0.5 * base * height
    override fun drag() = println("Triangle is dragging")
}

// Question is how Player class drag will work, opr in future if any new class with drag() comes,
// how it will work, Suppose Player is of some other inheritance tree part, Similarly in future we have
// Some other Classes also which belongs to some other inheritance tree, and we need a common behaviour inside all of them,
// That is drag behaviour, then how we will solve this?
/** We will solve this by using interface---------------
 * */
class Player(val name: String) : Draggable{
   override fun drag() = println("$name is dragging")
}