package weapons

class Trashbringer:Weapon {
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
        return 82
    }

    override fun critChance(): Int {
        return 33
    }

    override fun equip(): Boolean {
        return false
    }

    override fun name(): String {
        return "Trashbringer"
    }

    override fun minDamage(): Int {
        return 611
    }

    override fun maxDamage(): Int {
        return 653
    }

    override fun weaponSpeed(): Float {
        return 1.7f
    }

    override fun strength(): Int {
        return 183
    }

    override fun stamina(): Int {
        return 300
    }

    override fun agility(): Int {
        return 213
    }

    override fun intellect(): Int {
        return 11
    }
}