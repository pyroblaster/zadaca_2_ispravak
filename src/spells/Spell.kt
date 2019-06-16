package spells

interface Spell{
    fun name():String
    fun type():String
    fun hitDamage():Int
    fun critDamage():Int
    fun miss():Boolean
    fun hitChance():Int
    fun critChance():Int
    fun minDamage():Int
    fun maxDamage():Int
    fun castTime():Float
}