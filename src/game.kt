import functions.*


fun game(){
    welcome()
    var name = enterName()
    var character = chooseClass(name)
    println(character.name())
    var enemy = newEnemy()
    println(enemy.name())

}