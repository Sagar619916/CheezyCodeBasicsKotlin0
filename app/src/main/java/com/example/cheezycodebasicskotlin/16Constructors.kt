package com.example.cheezycodebasicskotlin

fun main(){
    var car =  Automobile("car", 4, 5, true)

    var person = person("A",20)

    println(person.age)
    println(person.name)

    var person2 = person("B",18)
    println(person2.age)
    println(person2.name)

    // Secondary constructor--
    /** To create Automobile2 object we have to pass everything, to solve this propblem secondary constructor is their.
     * */
    // Like this no need  to pass every proprty--
    var car2 = Automobile2("car2","Petrol")
    // Below will get two options, primary and secondary constructor--------
   // var car3 = Automobile2()

}
// First way of defining constructor
class  Automobile(val name: String, val tyres: Int, val maxsitting: Int, hasAirbags: Boolean){ // Primary constructor
    //If we want to execute something while object creation of class, we use "init Block"
    init {
        println("$name is created")
    }
    init {
        println("2nd Initializer Block")
    }

    var airBags = hasAirbags
    fun drive(){}
    fun applybrakes(){}
}

class Empty{}

// Second way of defining constructor
/** Note: After using Val and var properties are defined.(otherwise they are parameters).
* */
/**By this way we can do operations with properties and methods.
 * */
class person(nameParam: String, ageParam:Int){
    val name: String = "$nameParam - clan" // to do more operations.
    var age: Int = ageParam
    var canVote: Boolean = ageParam > 18       // we can create evaluated properties as well
    
}

// Secondary Constructor--------------

class Automobile2(val name: String,val tyres: Int, val maxSeating: Int, val engineType: String){
    /** To create Automobile2 object we have to pass everything, to solve this propblem secondary constructor is their.
     * */
    // By using "this" we are calling primary constructor
    //Note: In Kotlin whenever we create Secondary Constructor, we have to call our primary Constructor.
    constructor(nameParam:String, engineParam:String) : this(nameParam,4,5,engineParam)

}

