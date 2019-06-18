import character.Character
import enemies.Enemy
import enemies.Fordcord
import enemies.Toongooz
import functions.*


fun game(){
    welcome()
    var name = enterName()
    var character = chooseClass(name)
    var damage:Int
    var boss:Enemy
    var enemy:Enemy
    println(character.name())
    forestWelcome()
    while(character.level() <10){
        enemy = newEnemy()
            while (enemy.health()>0){
                damage = fightAction(character)
                dmgTakenCharacter(character,enemy.damage())
                dmgTakenEnemy(enemy,damage)
                testChar(character)
                testEnemy(enemy)
                if(enemy.health<0)
                    character.onKill(enemy.experience())
            break
            }
    }
    boss = Fordcord()
    println("Ahhh!!! I knew this time would come..")
    while (boss.health()>0){
        damage = fightAction(character)
        dmgTakenCharacter(character,boss.damage())
        dmgTakenEnemy(boss,damage)
        testChar(character)
        testEnemy(boss)
        if(boss.health<0)
            character.onKill(boss.experience())
        break
    }
    while(character.level() >10 && character.level()<20){
        enemy = newEnemy()
        while (enemy.health()>0){
            damage = fightAction(character)
            dmgTakenCharacter(character,enemy.damage())
            dmgTakenEnemy(enemy,damage)
            testChar(character)
            testEnemy(enemy)
            if(enemy.health<0)
                character.onKill(enemy.experience())
            break
        }
    }
    boss = Toongooz()
    while (boss.health()>0){
        damage = fightAction(character)
        dmgTakenCharacter(character,boss.damage())
        dmgTakenEnemy(boss,damage)
        testChar(character)
        testEnemy(boss)
        if(boss.health<0)
            character.onKill(boss.experience())
        break
    }

}


