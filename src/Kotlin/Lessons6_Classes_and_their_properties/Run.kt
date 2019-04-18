package Kotlin.Lessons6_Classes_and_their_properties

fun main(args: Array<String>) {
    val personAlex = Person("Alex","Kozlovsky",22)
   // val personLesha=Person("a");
    println(personAlex)
    val car = Car(12.2, 10)
    println(car.isNew)
    car.isNew=false
    println("after eq false "+car.isNew)
    car.isNew=true
}
