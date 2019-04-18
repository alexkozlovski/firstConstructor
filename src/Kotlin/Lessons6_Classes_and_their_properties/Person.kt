package Kotlin.Lessons6_Classes_and_their_properties

class Person (private var firstName:String, private var lastName:String, private var age:Int){
    var name:String = ""
    fun getfirstName():String = this.firstName
    fun getlastName():String = this.lastName
    override fun toString():String{
        return "Class Person:\n             name: ${this.firstName }, last name${this.lastName} age: ${this.age}."
    }
}
