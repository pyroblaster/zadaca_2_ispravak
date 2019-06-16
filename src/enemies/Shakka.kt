package enemies

class Shakka:Enemy {
    override fun name(): String {
        return "Shakka"
    }

    override fun type(): String {
        return "Boss"
    }

    override fun damage(): Int {
        return 50
    }
}