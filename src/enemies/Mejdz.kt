package enemies

class Mejdz:Enemy {
    override fun name(): String {
        return "Mejdz"
    }

    override fun type(): String {
        return "Minion"
    }

    override fun damage(): Int {
        return 15
    }
    override fun experience(): Int {
        return 15
    }
}