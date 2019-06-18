package functions

import character.Character
import enemies.Enemy
import spells.Pyroblast
import spells.Spell

fun dmgTakenCharacter(character: Character, damage:Int){
    character.health = character.health-damage
}
fun dmgTakenEnemy(enemy: Enemy, damage:Int){
    enemy.health = enemy.health-damage
}
fun fightAction(character: Character): Int{
    println("Choose your actions: ")
    println("For normal weapon hit press 1!")
    println("For weapon crit hit press 2!!")
    println("For normal spell hit press 3!")
    println("For spell crit hit press 4!")

    var i: Int = 0
    val action:Int
    i = readLine()!!.toInt()
    when {
        i == 1 -> {
            action = character.weapon().hitDamage()
        }
        i == 2 -> {
            action = character.weapon().critDamage()
        }
        i == 3 -> {
            action = character.spell().hitDamage()
        }
        i == 4 -> {
            action = character.spell().critDamage()
        }
        else -> {
            action = character.weapon().hitDamage()
        }
    }
    return action
}