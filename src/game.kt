import character.Paladim
import functions.chooseClass
import functions.enterName
import functions.welcome


fun game(){
    welcome()
    var name = enterName()
    var character = chooseClass(name)
    print(character.name())


}