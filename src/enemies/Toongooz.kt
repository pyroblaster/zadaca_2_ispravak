package enemies

class Toongooz:Enemy, BaseEnemy("Toongooz", "Boss", 500) {
    override var health: Int = 300
    override fun name(): String {
        return  name
    }

    override fun type(): String {
        return type
    }

    override fun health(): Int {
        return  health
    }

    override fun experience(): Int {
        return experience
    }

    override fun damage(): Int {
        return 75
    }
    override fun healthLeft(health: Int, damage: Int): Int {
        return health - damage
    }
}