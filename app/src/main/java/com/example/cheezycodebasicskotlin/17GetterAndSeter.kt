package com.example.cheezycodebasicskotlin


fun main(){

    // here called default Constructor.
    val ob = Calculator()
    println(ob.add(1,3))

    val p1 = Person("Cheezy", 21)
    println(p1.age) // Get the value
    p1.age = 23  //   set the value
    p1.age = -12 // we can give negative value also, but age can't be negative, so to prevent this we use "Setter".

    println(p1.name)  // It will give the output in uppercase, because of getter.
}

class Calculator{ // Default Constructor

    // To initilaize value later on
    /** lateinit cannot be "val" type
    * */
   lateinit var message: String
    fun  add(a: Int,b:Int): Int{
        return a+b
    }

    fun multiply(a: Int, b: Int): Int{
        return a*b
    }
}

// Getter and setter-------------
 class Person(nameParam: String, ageParam: Int){

     var name: String = nameParam
    //Getter for property
    get() {
        println("Name getter is called")
        //whenever "name" proprty is accessed, it will call getter,
        // getter will convert that value to upper case and return it.
        return field.uppercase()  
    }
    var age: Int = ageParam
        //setter for property
        set(value) {
            if (value>0){
                field = value
            }
            else{
                println("Age cant be negative")
            }
        }
    // Default Syntax of Getter and setter in kotlin------------
    var eamil: String = ""
        get() = field
        set(value) {
            field = value
        }

 }