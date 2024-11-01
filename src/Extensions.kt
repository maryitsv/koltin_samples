import kotlin.random.Random

//  extensions
fun main(args : Array<String>) {
    println("SomeString".getCustomName())
    println(3.getCustomName())

    val list :ArrayList<Int> = arrayListOf(3,4,5)
    println(list.howMany())

    Book.printMe()

}

fun String.getCustomName () = "a string of characers"

fun Int.getCustomName() = "a interger number"

fun ArrayList<Int>.howMany() = "this list $size"


class Book{
    companion object{

    }
}
fun Book.Companion.printMe(){
    println("book has been printed")
}



