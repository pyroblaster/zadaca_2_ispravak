package character

class Palatim(val name:String):Character {
    override fun name(): String {
        return name
    }

    override fun type(): String {
        return "Palatim"
    }

    override fun strength(): Int {
        return 5
    }

    override fun stamina(): Int {
        return 5
    }

    override fun agility(): Int {
        return 5
    }

    override fun intellect(): Int {
        return 5
    }
    override fun healthPoints(): Int {
        return 25 + stamina()*10
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