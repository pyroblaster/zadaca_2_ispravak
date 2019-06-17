package enemies

interface Enemy{
    fun name():String
    fun type():String
    fun health():Int
    fun damage():Int
    fun experience():Int
    fun healthLeft(health: Int, damage:Int):Int
    var health:Int
}