package Kotlin.Lessons7_Import_methods_and_classes

import Kotlin.Lessons7_Import_methods_and_classes.animals.cat.CatA
import Kotlin.Lessons7_Import_methods_and_classes.animals.dog.DogA
import Kotlin.Lessons7_Import_methods_and_classes.animals.*

fun main(args: Array<String>) {
    val catA = CatA()
    val dogA = DogA()
    method()
    method2()
}
