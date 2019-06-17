package enemies

class Linotaur:Enemy, BaseEnemy("Linotaur", "Boss", 1000) {
    override var health: Int = 500
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
        return 100
    }
    override fun healthLeft(health: Int, damage: Int): Int {
        return health - damage
    }
}