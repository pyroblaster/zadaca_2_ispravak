package enemies

class Vorior:Enemy {
    override fun name(): String {
        return "Vorior"
    }

    override fun type(): String {
        return "Minion"
    }

    override fun damage(): Int {
        return 5
    }
    override fun experience(): Int {
        return 5
    }
}