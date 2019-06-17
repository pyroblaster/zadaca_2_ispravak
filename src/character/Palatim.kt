package character

import weapons.Trashbringer
import weapons.Weapon

class Palatim(val name:String):Character, BaseCharacter("Palatim",5,5,5,5,1) {
    override var health: Int = 25 + stamina()*10
    override fun name(): String {
        return name
    }

    override fun type(): String {
        return type
    }

    override fun strength(): Int {
        return strength
    }

    override fun stamina(): Int {
        return stamina
    }

    override fun agility(): Int {
        return agility
    }

    override fun intellect(): Int {
        return intellect
    }
    override fun healthPoints(): Int {
        return health
    }
    override fun level(): Int {
        return level
    }
    override fun levelUp() {
        strength +=2
        stamina +=2
        agility+=2
        intellect+=2
        level+=1
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
    override fun healthLeft(health: Int, damage: Int): Int {
        return health - damage
    }
}