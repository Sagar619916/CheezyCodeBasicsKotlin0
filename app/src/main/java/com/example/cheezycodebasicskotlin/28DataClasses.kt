package com.example.cheezycodebasicskotlin

fun main(){

    val p1 = Persona(1,"John")
    val p2 = Persona(1,"John")

    // copy function, utility functions
    val p3 = p1.copy(id = 3)
    println(p3)

   // Destructuring or Component N functions
    val(id,name) = p1
    println(id)
    println(name)
    println(p1.component1())
    println(p1.component2())

}

data class Persona(val id: Int, val name: String) // At least One parameter is "MUST" In Data clasees
{


}