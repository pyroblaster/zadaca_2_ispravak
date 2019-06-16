package character

class Paladim(val name:String):Character {
    val name1:String = name
    override fun name(): String {
        return name
    }

    override fun type(): String {
        return "Paladim"
    }

    override fun strength(): Int {
        return 5
    }

    override fun stamina(): Int {
        return 3
    }

    override fun agility(): Int {
        return 4
    }

    override fun intellect(): Int {
        return 2
    }
    override fun healthPoints(): Int {
        return 20 + stamina()*10
    }
    override fun level(): Int {
        return 0
    }
    override fun levelUp() {
        strength()+2
        stamina()+2
        agility()+2
        intellect()+2
    }
    override fun alive() : Boolean {
        if(healthPoints()>0) return true
        else return false
    }
    override fun experience(): Int {
        return 0
    }
}