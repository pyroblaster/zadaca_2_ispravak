package weapons

class Freshbringer:Weapon, BaseWeapon(63,12,10,22,3.0f,3,4,5,6) {
    override fun hitDamage(): Int {
        return (minDamage()..maxDamage()).random()
    }

    override fun critDamage(): Int {
        return (minDamage()..maxDamage()).random()*2
    }

    override fun miss(): Boolean {
        if((0..100).random()>hitChance()) return true
        else return false
    }

    override fun hitChance(): Int {
        return hitChance
    }

    override fun critChance(): Int {
        return critChance
    }

    override fun equip(): Boolean {
        return false
    }

    override fun name(): String {
        return "Freshbringer"
    }
    override fun minDamage(): Int {
        return minDamage
    }

    override fun maxDamage(): Int {
        return maxDamage
    }

    override fun weaponSpeed(): Float {
        return weaponSpeed
    }

    override fun strength(): Int {
        return strength
    }

    override fun stamina(): Int {
        return stamina
    }

    override fun agility(): Int {
        return agility
    }

    override fun intellect(): Int {
        return intellect
    }
}