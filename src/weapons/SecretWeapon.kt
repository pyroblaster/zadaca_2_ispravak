package weapons

class SecretWeapon:Weapon,BaseWeapon(100,100,9999,10000,0.1f,2500,2500,2500,2500) {
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
        return "Falcon Heavy"
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