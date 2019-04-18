package Kotlin.Lessons4_Functions

fun main(args: Array<String>) {
    var a1:Byte =2
    println("1st fun : ${myFirstFunction()}")
    println("2nd fun: ${mySeconFunction(a1.toLong())}")
    myThirdFunction()
    println("4 fun: ${myFourFunction(1,2.3)}")
    val res = myFirstFunction()
    var a:Double=.2;
    var b:Int=a.toInt()
}
fun myFirstFunction():Int{
    return 1
}
fun mySeconFunction(a:Long):Int{
    return a.toInt()
}
fun myThirdFunction(){
        println("3rd fun: \"lol\"")
}
fun myFourFunction(a:Long,b:Double)=a.plus(b)