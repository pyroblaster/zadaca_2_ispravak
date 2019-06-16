package weapons

class Cashbringer:Weapon {
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
        return 78
    }

    override fun equip(): Boolean {
        return false
    }

    override fun name(): String {
        return "Cashbringer"
    }

    override fun minDamage(): Int {
        return 712
    }

    override fun maxDamage(): Int {
        return 833
    }

    override fun weaponSpeed(): Float {
        return 1.3f
    }

    override fun strength(): Int {
        return 250
    }

    override fun stamina(): Int {
        return 250
    }

    override fun agility(): Int {
        return 250
    }

    override fun intellect(): Int {
        return 250
    }
}