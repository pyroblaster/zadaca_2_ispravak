package weapons

abstract class BaseWeapon (
    val hitChance:Int,
    val critChance:Int,
    val minDamage:Int,
    val maxDamage:Int,
    val weaponSpeed:Float,
    val strength:Int,
    val stamina:Int,
    val agility:Int,
    val intellect:Int
)