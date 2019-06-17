package enemies

class Shakka:Enemy, BaseEnemy("Shakka", "Boss", 300) {
    override var health: Int = 200
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
        return 50
    }
    override fun healthLeft(health: Int, damage: Int): Int {
        return health - damage
    }
}