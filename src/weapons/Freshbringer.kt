package weapons

class Freshbringer:Weapon {
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
        return 63
    }

    override fun critChance(): Int {
        return 12
    }

    override fun equip(): Boolean {
        return false
    }

    override fun name(): String {
        return "Freshbringer"
    }

    override fun minDamage(): Int {
        return 10
    }

    override fun maxDamage(): Int {
        return 22
    }

    override fun weaponSpeed(): Float {
        return 3.0f
    }

    override fun strength(): Int {
        return 3
    }

    override fun stamina(): Int {
        return 4
    }

    override fun agility(): Int {
        return 5
    }

    override fun intellect(): Int {
        return 6
    }
}