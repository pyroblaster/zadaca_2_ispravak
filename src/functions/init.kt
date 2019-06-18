package functions

import character.*
import enemies.*

fun welcome() {
    println("Welcome to the World of Whatcraft?!")
}
fun forestWelcome(){
    println("I'll teleport you in sec...")
    Thread.sleep(1500)
    println("Good, we are here. They call this place Forest, we are gonna kill few minions here and there and if " +
            "you are good enough we will try to kill might Fordcord, emperor of Forest.")
}

fun enterName(): String {
    println("Choose your character name: ")
    val name: String = readLine()!!
    return name
}

fun chooseClass(name: String): Character {
    println("Choose your class: ")
    println("Would you like to destroy your enemies using power of mighty Paladim? Then you shall press 1!")
    println("You like fat dorfs who tank their way into life? Here I am! Press 2!")
    println("Heal me, heal me! Ready to heal yourself while doing nothin? 3 it is!")
    println("Team player? Then Palatim is for you, pls 4...")

    var i: Int = 0
    val character: Character
    i = readLine()!!.toInt()
    when {
        i == 1 -> {
            character = Paladim(name)
            println("Paladim it is!")
        }
        i == 2 -> {
            character = Palagrim(name)
            println("Palagrim it is!")
        }
        i == 3 -> {
            character = Palahim(name)
            println("Palahim it is!")
        }
        i == 4 -> {
            character = Palatim(name)
            println("Palatim it is!")
        }
        else -> {
            character = SecretCharacter("Elon Musk")
            println("GODMODE on.")

        }
    }
    return character
}

fun newEnemy():Enemy{
    val i = (1..3).random()
    var enemy:Enemy = Vorior()
    when {
        i == 1 -> {
            enemy = Vorior()
            println("Hi, its me, Vorior, not so might Warrior. :(")
        }
        i == 2 -> {
            enemy = Mejdz()
            println("I cast when i must...")
        }
        i == 3 -> {
            enemy = Rendjer()
            println("I've got one arrow for you, and one for me. :O")
        }
    }
    return enemy
}
