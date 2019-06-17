package enemies

class Vorior:Enemy, BaseEnemy("Vorior", "Minion", 15) {
    override var health: Int = 5
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
        return 5
    }
    override fun healthLeft(health: Int, damage: Int): Int {
        return health - damage
    }
}