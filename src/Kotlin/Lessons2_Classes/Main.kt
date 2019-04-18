package Kotlin.Lessons2_Classes

/**
 * Created by user on 21.10.2018.
 */
fun main(args: Array<String>) {
    val userJava=UserJava("Mediator Java")
    println(userJava.name)

    val userKotlin = UserKotlin("Mediator Kotlin")
    println(userKotlin.name)
    println("name : ${userKotlin.name}")
}
