package com.example.cheezycodebasicskotlin

fun main(){
  /*  val tile = Red("Mushroom",25)
    val tile2 = Red("Fire",30)
    println("${tile.points} - ${tile.type}")*/

    val tile: Tile = Red("Mushroom",25)
    val points: Int = when(tile){
        is Red -> tile.points*2
        is Blue -> tile.points*5
    }
    println(points)


}

sealed class Tile // Its abstract Tile class, object ccannot be created,
class Red(val type: String, val points: Int) : Tile()
class Blue(val points: Int) : Tile()