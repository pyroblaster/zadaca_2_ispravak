package spells

class Pyroblast:Spell {
    override fun name(): String {
        return "Pyroblast"
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
        return 77
    }

    override fun critChance(): Int {
        return 12
    }

    override fun minDamage(): Int {
        return 5
    }

    override fun maxDamage(): Int {
        return 10
    }

    override fun castTime(): Float {
        return 0.0f
    }
}