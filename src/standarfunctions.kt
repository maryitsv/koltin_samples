import kotlin.random.Random

//standar functions
fun main(args : Array<String>) {
    //packages
    //naming convention
    //imports

    // standar funcions
    //Scope
    /*
    let -> lambda function allow us to run some code on and object, w can access the argument it by default
    with -> perform a block of code on an object, the context is available as this(the keyword can be omitted)
    run -> same as with but invokes as an extension function, useful when you need a lambda that returns a result, can be used to limit the scope of variable
    apply ->
    also ->
     */

    /*
    takelf
    takeunless*/

    //*******************let
    /*
    val animals =listOf("cat","dog","mouse", "bear")
    animals.map{it.length}.filter{it>3}
        .let{
            println(it) }

    val animalsnulable = arrayListOf<String?>()

    for (i in 1..3){
        println("input and animal")
        val input  = readLine()
        input?.let{
            if(it==""){
                animalsnulable.add(null)
            } else {
                animalsnulable.add(it)
            }
        }


    }

    animalsnulable.forEach{
        println("feeding animal $it")
    }*/

    // ******************with

    with(Car()){
        speed =80
        drive()
        println("car is driving")
    }


    // run
    Car().run{
        speed=70
        drive()
        println("car is driving  $speed")
        this // we return the object
    }

    run {
        val car = Car() // car ondly live in this scope
        car.speed = 80
        car.drive()
    }


    val rest = Restorant().run{
        standarDish = "fish and chips"
        todaySpecial = "arroz con pollo"
        printMenu()
        this
    }
    println(rest)

    //Apply return the initial object
    //can be used to apply some functionality and return a result
    // common use is applying configuration to obj creation

    val myCar = Car().apply{
        speed = 140
        color = "blue"
        startCar()
    }
    println("apply return a obj $myCar")

    Lock().unlock(
        Key().apply {
            secretCode = "mm"
            carve()
        }
    )

    /*also used for performing some additionalactions on an object
    * common use case is adding some actions that dont affect the object such as logging or debugging information
    * removing an also block should not affect the execution of a program
    * */


    Car().apply {
        speed =77
        startCar()
    }.also {
        println("the car has been started")
    }


    /*
    takeif
    * returns the object if the predicate values to true
    * otherwise return null
    * */

    val number = Random.nextInt(100)
    val evenOrNull = number.takeIf { it % 2 ===0 }
    println("number is $number")
    println("even or null  $evenOrNull")

    /* takeunless return the object if the predicate values to false
    * otherwise return null
    * */

    val oddOrNull = number.takeUnless { it%2 ===0 }
    println("odd or null  $oddOrNull")
}
class Lock{

    fun unlock(key:Key){
        println("unlock with key $key")
    }
}

class Key{
    var secretCode = ""
    fun carve(){
        println("carving the key")
    }
}

class Car{
    var speed = 50
    var color = ""
    fun drive() {
        println("driving at $speed")
    }

    fun startCar(){
        println("start car")
    }

}

class Restorant {
    var standarDish = ""
    var todaySpecial =""
    fun printMenu(){
        println("standar dish $standarDish")
        println("special dish $todaySpecial")
    }
}
