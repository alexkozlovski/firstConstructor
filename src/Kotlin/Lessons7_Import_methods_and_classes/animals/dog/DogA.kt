package Kotlin.Lessons7_Import_methods_and_classes.animals.dog

class DogA{
    var name:String=""
    constructor()
    constructor( name:String){
        println("dog")
        this.name=name
    }
    fun a1(){
        if(name.isNotEmpty()) println("not null construct and out: $name")
        println("A1")
    }
    fun a2(){
        println("A2")
    }
}
