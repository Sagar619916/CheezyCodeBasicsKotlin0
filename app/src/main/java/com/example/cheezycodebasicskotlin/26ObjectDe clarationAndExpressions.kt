package com.example.cheezycodebasicskotlin

fun  main(){
println(B.num)
C.test()

    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.dsiplay()

    /** Object expression
     * */
    var testObj = object {
        val x: Int =10
        fun method(){
            println("I am obj expression")
        }
    }

    println(testObj.method())


}


// Object Decalration--------
object B{
    val num: Int = 10

}

object C{
    val p:Int = 20
    fun test(){
        println("I am object C")
    }
}

/** Siggleton Example---
 * */

object SharingWidget{
   private var twitterLikes = 0
   private var fbLikes = 0

    fun incrementTwitterLikes()  = twitterLikes++
    fun incrementFbLikes()  = fbLikes++
    fun dsiplay()  = println("Facebook -$fbLikes -- Twitter - $twitterLikes")
}




