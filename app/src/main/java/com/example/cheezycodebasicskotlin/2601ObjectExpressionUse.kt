package com.example.cheezycodebasicskotlin

fun main(){
var obj = object : Cloneable{
    override fun clone() { println("I am Cloned")
    }
}
  obj.clone()

  var obj2 = object: Person2(name = "sagar"){
      override fun fullName() {
          super.fullName()
          println("Anonymous - $name")
      }
  }
    obj2.fullName()
}



interface Cloneable{
    fun clone()
}

open class Person2(val name: String){
    open fun fullName()= println("full Name - $name")

}

