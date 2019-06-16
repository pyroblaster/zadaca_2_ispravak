package weapons

class Slashbringer:Weapon {
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
        return 77
    }

    override fun critChance(): Int {
        return 29
    }

    override fun equip(): Boolean {
        return false
    }

    override fun name(): String {
        return "Slashbringer"
    }

    override fun minDamage(): Int {
        return 112
    }

    override fun maxDamage(): Int {
        return 197
    }

    override fun weaponSpeed(): Float {
        return 1.9f
    }

    override fun strength(): Int {
        return 12
    }

    override fun stamina(): Int {
        return 11
    }

    override fun agility(): Int {
        return 10
    }

    override fun intellect(): Int {
        return 9
    }
}