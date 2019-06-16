package weapons

class Ashbringer:Weapon {
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
        return 97
    }

    override fun critChance(): Int {
        return 38
    }

    override fun equip(): Boolean {
        return false
    }

    override fun name(): String {
        return "Ashbringer"
    }

    override fun minDamage(): Int {
        return 500
    }

    override fun maxDamage(): Int {
       return 630
    }

    override fun weaponSpeed(): Float {
        return 3.0f
    }

    override fun strength(): Int {
        return 100
    }

    override fun stamina(): Int {
        return 100
    }

    override fun agility(): Int {
        return 100
    }

    override fun intellect(): Int {
        return 100
    }
}