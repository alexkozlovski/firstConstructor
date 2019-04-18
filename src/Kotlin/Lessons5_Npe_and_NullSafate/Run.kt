package Kotlin.Lessons5_Npe_and_NullSafate

fun main(args: Array<String>) {
    val st:String="a"
    val size= getst()?.length
    println("st length=$size")
}
fun getst():String?{
    return "asd"
}
