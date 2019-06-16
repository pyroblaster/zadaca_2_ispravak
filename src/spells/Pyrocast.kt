package spells

class Pyrocast:Spell {
    override fun name(): String {
        return "Pyrocast"
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
        return 90
    }

    override fun critChance(): Int {
        return 43
    }

    override fun minDamage(): Int {
        return 10
    }

    override fun maxDamage(): Int {
        return 17
    }

    override fun castTime(): Float {
        return 5.0f
    }
}