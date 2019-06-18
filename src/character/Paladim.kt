package character

import spells.Pyroblast
import spells.Spell
import weapons.Trashbringer
import weapons.Weapon

class Paladim(val name:String):Character, BaseCharacter("Paladim", 5,3,4,2,1,0) {
    override fun spell(): Spell {
        return Pyroblast()
    }

    override fun onKill(exp: Int) {
        experience = experience + exp
        experience()
    }

    override var health: Int = 20 + stamina()*10
    override fun name(): String {
        return name
    }

    override fun type(): String {
        return type
    }

    override fun strength(): Int {
        return strength + weapon().strength()
    }

    override fun stamina(): Int {
        return stamina + weapon().stamina()
    }

    override fun agility(): Int {
        return agility + weapon().agility()
    }

    override fun intellect(): Int {
        return intellect + weapon().intellect()
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
    override fun experience():Int {
        if (experience%1==0) levelUp()
        return experience
    }
    override fun weapon(): Weapon {
       return Trashbringer()
    }
    override fun healthLeft(health: Int, damage: Int): Int {
        return health - damage
    }

}