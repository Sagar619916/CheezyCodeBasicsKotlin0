package com.example.cheezycodebasicskotlin

fun main(){

    val circle = Circle5(4.0)
    val player = Player2("Smiley")

    // Type checking using "is" operator
    if (circle is Circle5){   // If we give Player2 in Circle5 it will give compatible error, as kotlin compiler is smart
        println("This is Cirlce5")
    }
    /** Smart Casting----
     * */
    val arr = arrayOf(circle,player, Test())  // After adding Test() we will get ClassCastException, because
    for (obj in arr){
        if (obj is Circle5){ //Here due to smart casting in kotlin "obj" becomes Circle5
            obj.radius       // That's why we are getting here methods & properties of Circle5 only, After obj.
            println( obj.area())  // This will print the area of Circle5, because of Smart casting.
        }
        else{
            (obj as Player2).sayMyName()  //Way of smartcasting using "as" operator.
                                          // We got error in line 14 because, in else we cast "obj" as Player2 but we cannot cast Player to Test(),
                                          // Thats why we got the "Test cannot be cast to class com.example.cheezycodebasicskotlin.Player2"
            /** Note -  Thats why we should check the type before writting this kind of Code.
             * */
        }
    }
}

interface Draggable2{
    fun drag()
}

abstract class Shape5 : Draggable2{
    abstract fun area() : Double
}

class Circle5(val radius: Double) : Shape5(){
    override fun area(): Double = Math.PI * radius * radius
    override fun drag() = println("Circle is dragging")
}

class Player2(val name: String) : Draggable2{
    override fun drag() = println("$name is dragging")
    fun sayMyName() = println("Hey my name is - $name")
}

class Test{

}