package weapons

class Bashbringer:Weapon {
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
        return 80
    }

    override fun critChance(): Int {
        return 19
    }

    override fun equip(): Boolean {
        return false
    }

    override fun name(): String {
        return "Bashbringer"
    }

    override fun minDamage(): Int {
        return 200
    }

    override fun maxDamage(): Int {
        return 232
    }

    override fun weaponSpeed(): Float {
        return 2.6f
    }

    override fun strength(): Int {
        return 17
    }

    override fun stamina(): Int {
        return 21
    }

    override fun agility(): Int {
        return 6
    }

    override fun intellect(): Int {
        return 3
    }
}