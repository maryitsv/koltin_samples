import kotlin.random.Random

//  generics and type constraints
fun main(args : Array<String>) {
// a class can have a type parameters
    // the type can be used by variables and methods
    // useful when a class can handle multiple types of parameters
    // sample val animals: Array<String>

    val myBox = Box<String>()
    myBox.display("content")

    val carBox = Box<CarGeneric>()
    carBox.display(CarGeneric())

    val myNewBox = NewBox<String, Int>()
    myNewBox.display("new content",7)

    var info = Info<String>()
    info.getLenght("angela")

    var info2 = Info<Int>()
    info2.getLenght(20180121)

    var infoMessage = InfoMessage<Int,String>()
    infoMessage.getLenght(20180121, "hey")
}

class Box<T>{
    fun display(item:T){
        println(item)
    }
}

class CarGeneric{
}

class NewBox<T,U> {
    fun display(item:T, item2:U){
        println(item)
        println(item2)
    }
}

class Info<T>{
    fun getLenght(item:T){
        println( item.toString().length )
    }
}


class InfoMessage<T,U>{
    fun getLenght(item:T, message:U){
        println( "${item.toString().length}  ${message}")
    }
}