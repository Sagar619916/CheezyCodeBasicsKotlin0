package com.example.cheezycodebasicskotlin

fun main(){
    var pizza1: Pizza = Pizza.Factory.create("Peppy Paneer")
    println(pizza1)

    // Here I am calling via Factory reference - don't want to use Factory  ref
    // Now after defining as companion
    var pizza2: Pizza = Pizza.create("Tomato")

    // One more thing we can do - If we want compulsory for everyone to call this Create() method if they want Pizza
    // For that we will mark tthe constructo as private.
  /**Uncomment below to see error.....
   * */
//  var pizza3: Pizza = Pizza() // Now Everyone needs to call create() method for Pizza
    // i.e. everyone has to call its factory.

}

// Example of Factory pattern using Companion

class Pizza private constructor(val type: String, val toppings: String){
  companion object Factory{ //this is my Factory object
        fun create(pizzaType: String) : Pizza{
            return when(pizzaType){
                "Tomato" -> Pizza("Tomato", "Tomato, Cheese")
                "Peppy Paneer" -> Pizza("Pepp Paneer", "Paneer, Pepper")
                else -> Pizza("Basic", "Onion, Cheese")
            }
        }
    }

    override fun toString(): String {
        return "Pizza(type='$type', toppings='$toppings')"
    }

}

