package weapons

class SecretWeapon:Weapon {
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
        return 100
    }

    override fun critChance(): Int {
        return 100
    }

    override fun equip(): Boolean {
        return false
    }

    override fun name(): String {
        return "Falcon Heavy"
    }

    override fun minDamage(): Int {
        return 10000
    }

    override fun maxDamage(): Int {
        return 10000
    }

    override fun weaponSpeed(): Float {
        return 0.1f
    }

    override fun strength(): Int {
        return 2500
    }

    override fun stamina(): Int {
        return 2500
    }

    override fun agility(): Int {
        return 2500
    }

    override fun intellect(): Int {
        return 2500
    }
}