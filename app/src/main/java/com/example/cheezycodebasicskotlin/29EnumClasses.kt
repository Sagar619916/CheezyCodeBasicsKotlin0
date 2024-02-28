package com.example.cheezycodebasicskotlin

fun main(){

    val day =  Day.MONDAY


    day.printFormattedDay()

    println(day)
    // After defining constructor
    println(day.number)

    for (i in Day.values()){
        println(i)
    }
}

enum class Day(val number: Int){
    /**Constant values that we can assign to our Variable---
     * */
    SUNDAY (1),
    MONDAY(2), // These are the objects of this enum class--
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

    fun printFormattedDay(){
        println("Day is $this")

    }

}