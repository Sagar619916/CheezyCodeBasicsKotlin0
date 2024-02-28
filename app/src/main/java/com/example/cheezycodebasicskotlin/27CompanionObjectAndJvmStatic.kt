package com.example.cheezycodebasicskotlin

fun main(){

  //  MyClass.MyObject.f()
    MyClass.f()
    MyClass.AnotherObject.g()

}



class MyClass{

    /** In Kotlin Companion is used for Factory pattern.
     * */
  companion  object MyObject{
      //Now after using JvmStatic f() can be used in Java class also.
      @JvmStatic
        fun f(){
            println("Hello I am F from Object")
        }
    }
    object AnotherObject{
        fun g(){
            println("Hello I am G from Another object")
        }
    }
}