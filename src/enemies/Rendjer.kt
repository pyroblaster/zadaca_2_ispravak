package enemies

class Rendjer:Enemy, BaseEnemy("Rendjer", "Minion", 25) {
    override var health: Int = 10
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
        return 10
    }
    override fun healthLeft(health: Int, damage: Int): Int {
        return health - damage
    }
}