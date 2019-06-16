package spells

class Pyrodust:Spell {
    override fun name(): String {
        return "Pyrodust"
    }

    override fun type(): String {
        return "Fire"
    }

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
        return 66
    }

    override fun critChance(): Int {
        return 13
    }

    override fun minDamage(): Int {
        return 7
    }

    override fun maxDamage(): Int {
        return 10
    }

    override fun castTime(): Float {
        return 2.0f
    }
}