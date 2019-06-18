package functions

import character.Character
import enemies.Enemy

/*
println(enemy.damage())
println("level"+character.level())
println("str"+character.strength())
println("sta"+character.stamina())
println("agi"+character.agility())
println("int"+character.intellect())
println("hp"+character.healthPoints())
character.levelUp()
println("level"+character.level())
println("str"+character.strength())
println("sta"+character.stamina())
println("agi"+character.agility())
println("int"+character.intellect())
println("hp"+character.healthPoints())
character.levelUp()
println("level"+character.level())
println("str"+character.strength())
println("sta"+character.stamina())
println("agi"+character.agility())
println("int"+character.intellect())
println("hp"+character.healthPoints())
character.levelUp()
println("level"+character.level())
println("str"+character.strength())
println("sta"+character.stamina())
println("agi"+character.agility())
println("int"+character.intellect())
println("hp"+character.healthPoints())
 */

fun testChar(character: Character){
    //println("char health " +character.health)
    //println("char healthpoints " +character.healthPoints())
    //println("char dmg " + character.weapon().hitDamage())
    println("char level " + character.level())
    println("char exp: "+ character.experience())
}

fun testEnemy(enemy: Enemy){
    //println("enemy health " +enemy.health)
    //println("enemy dmg " +enemy.damage())
    //println("enemy name " + enemy.name())
    //println("enemy type " + enemy.type())
}