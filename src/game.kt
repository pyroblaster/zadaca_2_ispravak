import character.Character
import functions.*


fun game(){
    welcome()
    var name = enterName()
    var character = chooseClass(name)
    println(character.name())
    forestWelcome()
    while(character.level() <10){
        var enemy = newEnemy()
            while (enemy.health()>0){
                character.health = character.healthLeft(character.health,5)
                println("health" +character.health)
                println("healthpoints" +character.healthPoints())
                println("dmg" + character.weapon().hitDamage())
                println("level" + character.level())
                if(character.health<0)
                    character.experience()+1
                    if(character.experience() == 5){
                        character.levelUp()
                        println("done")
                    break

            }

    }
}