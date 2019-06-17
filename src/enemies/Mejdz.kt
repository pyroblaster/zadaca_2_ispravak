package enemies

class Mejdz:Enemy, BaseEnemy("Mejdz", "Minion", 30) {
    override var health: Int = 15
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
        return 15
    }
    override fun healthLeft(health: Int, damage: Int): Int {
        return health - damage
    }
}