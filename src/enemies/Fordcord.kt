package enemies

class Fordcord:Enemy, BaseEnemy("Fordcord", "Boss", 150) {
    override var health: Int = 100
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
        return 25
    }
    override fun healthLeft(health: Int, damage: Int): Int {
        return health - damage
    }
}