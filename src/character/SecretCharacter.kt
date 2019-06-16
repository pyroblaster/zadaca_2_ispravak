package character

class SecretCharacter(val name:String):Character {
    override fun name(): String {
        return name
    }

    override fun type(): String {
        return "Elon Musk"
    }

    override fun strength(): Int {
        return 999
    }

    override fun stamina(): Int {
        return 999
    }

    override fun agility(): Int {
        return 999
    }

    override fun intellect(): Int {
        return 999
    }
    override fun healthPoints(): Int {
        return 10000 + stamina()*10
    }
    override fun level(): Int {
        return 0
    }
    override fun levelUp() {
        strength()+100
        stamina()+100
        agility()+100
        intellect()+100
    }
    override fun alive() : Boolean {
        return true
    }
    override fun experience(): Int {
        return 0
    }
}