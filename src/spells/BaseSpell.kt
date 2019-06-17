package spells

abstract class BaseSpell (
    val type:String,
    val hitChance:Int,
    val critChance:Int,
    val minDamage:Int,
    val maxDamage:Int,
    val castTime:Float
)