package enemies

class Toongooz:Enemy {
    override fun name(): String {
        return "Toongooz"
    }

    override fun type(): String {
        return "Boss"
    }

    override fun damage(): Int {
        return 75
    }
}