package enemies

class Linotaur:Enemy {
    override fun name(): String {
        return "Linotaur"
    }

    override fun type(): String {
        return "Boss"
    }

    override fun damage(): Int {
        return 100
    }
}