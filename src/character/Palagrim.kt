package character

import weapons.Trashbringer
import weapons.Weapon

class Palagrim(val name:String):Character {
    override fun name(): String {
        return name
    }

    override fun type(): String {
        return "Palagrim"
    }

    override fun strength(): Int {
        return 10
    }

    override fun stamina(): Int {
        return 10
    }

    override fun agility(): Int {
        return 5
    }

    override fun intellect(): Int {
        return 5
    }
    override fun healthPoints(): Int {
        return 50 + stamina()*10
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
    override fun weapon(): Weapon {
        return Trashbringer()
    }
}