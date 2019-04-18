package Kotlin.Lessons9_When
import Kotlin.Lessons9_When.Color.*
fun main(args: Array<String>) {
    //Thread.currentThread().join()
    var res = getFavoriteColor(YELLOW)
    println(res)
    var a=1
    var b=2
    when{
        (a>b)-> println("$a > $b  : true")
        (a<b)-> println("$a > $b  : true")
        (a==b)-> println("$a == $b : true")
        else-> println("huy v rot beri")
    }



}

fun getFavoriteColor(color: Color) = when (color) {
        WHITE,YELLOW -> "whiiite or YEEELLLOW"
    Color.BLACK -> "BLAAACK"
    else -> "undefined color"
}
class User: Thread() {
    override fun run() {
        Thread.currentThread().name="Mediator Thread"
        println(Thread.currentThread().name)
    }

}