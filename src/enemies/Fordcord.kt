package enemies

class Fordcord:Enemy {
    override fun name(): String {
        return "Fordcord"
    }

    override fun type(): String {
        return "Boss"
    }

    override fun damage(): Int {
        return 25
    }
}