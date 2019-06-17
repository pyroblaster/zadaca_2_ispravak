package spells

class Pyromast:Spell,BaseSpell("Fire", 89,23,15,18,1.0f) {
    override fun name(): String {
        return "Pyromast"
    }

    override fun type(): String {
        return type
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
        return hitChance
    }

    override fun critChance(): Int {
        return critChance
    }

    override fun minDamage(): Int {
        return minDamage
    }

    override fun maxDamage(): Int {
        return maxDamage
    }

    override fun castTime(): Float {
        return castTime
    }
}