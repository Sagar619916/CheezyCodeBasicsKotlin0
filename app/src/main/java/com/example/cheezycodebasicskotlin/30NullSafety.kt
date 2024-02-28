package com.example.cheezycodebasicskotlin

fun main(){

    var gender: String = "male"  // "Female", "Others"

    var gender2: String? =  null
    var isAdult: Boolean? = null

    if (gender2 != null) {
        gender2.uppercase()
    }

    gender2?.uppercase()

    // If we want to use multiple statements to check the object is null or not--
    /** Now We will use safeCall Along with Null---
     * */
    gender2?.let { //this Scope "it" points to gender2
        // This block only runs in gender2 is-  not null
        println("Line 1")
        //gender2 cannot be null inside this block
        println("Line 2 $gender2")  //gender2 is not giving error here, because it is always not null inside let block
        println("Line 3 $it")  // it points to gender2 here
    }

    /** Let we can use for Both null and Not null objects also.
     * */
    gender.let {

    }

    /** Now If we have to store gender2 value to some variable,
     * */
    // Elvis Operator-- It checks If the value is null it gives Default value "NA", otherwise it will take user value--
    var selectedValue = gender2 ?: "NA"
    // Not Null asserted operator - If gender2 is "Not null" it will execute the function,
    // If it is null then it will throw the exception.......
    var value = gender2!!.uppercase()
    //
}

