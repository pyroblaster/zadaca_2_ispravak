package character

import weapons.SecretWeapon
import weapons.Weapon

class SecretCharacter(val name:String):Character, BaseCharacter("Elon Musk", 999,999,999,999,1) {
    override var health: Int = 10000 + stamina()*10
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
        strength +=100
        stamina +=100
        agility+=100
        intellect+=100
        level+=1
    }
    override fun alive() : Boolean {
        return true
    }
    override fun experience(): Int {
        return 0
    }
    override fun weapon(): Weapon {
        return SecretWeapon()
    }
    override fun healthLeft(health: Int, damage: Int): Int {
        return health - damage
    }
}