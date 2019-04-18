package Kotlin.Lessons6_Classes_and_their_properties

/**
 * Created by user on 21.10.2018.
 */
class Car(private var weight:Double,private var size:Int) {
    var isNew:Boolean=false
    get(){
        return weight>size
    }
    set(value) {
/*        if(value){
            println("yes")
        }else{
            field=value
        }*/
        field=value
    }
}