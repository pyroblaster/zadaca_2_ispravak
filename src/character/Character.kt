package character

import weapons.Weapon

interface Character{
    fun name():String
    fun type():String
    fun strength():Int
    fun stamina():Int
    fun agility():Int
    fun intellect():Int
    fun healthPoints():Int
    fun level():Int
    fun levelUp()
    fun alive():Boolean
    fun experience():Int
    fun weapon():Weapon
    fun healthLeft(health: Int, damage:Int):Int
    var health:Int
}