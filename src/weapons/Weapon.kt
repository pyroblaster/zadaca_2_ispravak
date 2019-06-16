package weapons

interface Weapon{
    fun hitDamage():Int
    fun critDamage():Int
    fun miss():Boolean
    fun hitChance():Int
    fun critChance():Int
    fun equip():Boolean
    fun name():String
    fun minDamage():Int
    fun maxDamage():Int
    fun weaponSpeed():Float
    fun strength():Int
    fun stamina():Int
    fun agility():Int
    fun intellect():Int
}