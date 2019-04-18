package Kotlin.Lessons3_DataTypes

/**
 * Created by user on 21.10.2018.
 */
class User(private val name:String){
    fun getName(): String {
        return name
    }

    override fun toString(): String {
        return name
    }

}

