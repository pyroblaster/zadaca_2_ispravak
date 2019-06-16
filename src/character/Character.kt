package character

interface Character{
    fun name():String
    fun type():String
    fun strength():Int
    fun stamina():Int
    fun agility():Int
    fun intellect():Int
    fun healthPoints():Int
    fun level():Int
    fun levelUp()
    fun alive():Boolean
    fun experience():Int
}