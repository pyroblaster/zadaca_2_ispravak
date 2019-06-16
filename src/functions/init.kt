package functions

import character.*

fun welcome(){
    println("Welcome to the World of Whatcraft?!")
}

fun enterName():String{
    println("Choose your character name: ")
    val name :String = readLine()!!
    return name
}
fun chooseClass(name:String):Character{
    println("Choose your class: ")
    var i:Int = 0
    val character:Character
    i = readLine()!!.toInt()
    when {
        i == 1 -> {
            character= Paladim(name)
        }
        i == 2 -> {
            character= Palagrim(name)
        }
        i == 3 -> {
            character= Palahim(name)
        }
        i == 4 -> {
            character= Palatim(name)
        }
        else -> {
            character= SecretCharacter("Elon Musk")

        }
    }
    return character
}
fun chooseSpell(){}