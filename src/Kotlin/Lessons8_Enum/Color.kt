package Kotlin.Lessons8_Enum

/**
 * Created by user on 21.10.2018.
 */
enum class Color(var colorHex:String, var opacity:Double?=1.0) {
    WHITE("#FFFFFF",2.0),BLACK("#000000"),GREEN("#greeen"),Red("#reeeed")
}