package enemies

class Rendjer:Enemy {
    override fun name(): String {
        return "Rendjer"
    }

    override fun type(): String {
        return "Minion"
    }

    override fun damage(): Int {
        return 10
    }
    override fun experience(): Int {
        return 10
    }
}