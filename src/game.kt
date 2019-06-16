import functions.*


fun game(){
    welcome()
    var name = enterName()
    var character = chooseClass(name)
    print(character.name())


}