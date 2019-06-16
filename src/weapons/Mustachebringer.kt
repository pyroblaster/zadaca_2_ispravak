package weapons

class Mustachebringer:Weapon {
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
        return 17
    }

    override fun critChance(): Int {
        return 55
    }

    override fun equip(): Boolean {
        return false
    }

    override fun name(): String {
        return "Mustachebringer"
    }

    override fun minDamage(): Int {
        return 71
    }

    override fun maxDamage(): Int {
        return 943
    }

    override fun weaponSpeed(): Float {
        return 1.0f
    }

    override fun strength(): Int {
        return 31
    }

    override fun stamina(): Int {
        return 2
    }

    override fun agility(): Int {
        return 41
    }

    override fun intellect(): Int {
        return 17
    }
}