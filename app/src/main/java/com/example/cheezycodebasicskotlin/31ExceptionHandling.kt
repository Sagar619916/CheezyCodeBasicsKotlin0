package com.example.cheezycodebasicskotlin

fun main() {

    val arr = arrayOf(1, 2, 3)
    // In "try" we write the code where error can come--
    try {
        println(arr[5])
    }
    // We can take multiple catch blocks for multiple exceptions for one try block--
    catch (ex: NullPointerException){

    }
    //This Exception Class is parent class, we write it always in the End--
    catch (e: Exception) {
        println("Please Check the Arrray Index")
    } finally {
        println("I will execute no matter what")
    }
    println("This will  not run")

    //Throw example----------
    createUserList(5)
    createUserList(-2) // It will throw exception

}

// Throw example---
fun createUserList(count:Int){
    if(count<0){
       throw IllegalArgumentException("Count must be greater than zero")
    }
    else{
        println("User list created containing $count users")
    }
}