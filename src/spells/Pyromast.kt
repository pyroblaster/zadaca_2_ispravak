package spells

class Pyromast:Spell {
    override fun name(): String {
        return "Pyromast"
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
        return 89
    }

    override fun critChance(): Int {
        return 23
    }

    override fun minDamage(): Int {
        return 15
    }

    override fun maxDamage(): Int {
        return 18
    }

    override fun castTime(): Float {
        return 1.0f
    }
}