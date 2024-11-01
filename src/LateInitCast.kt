import kotlin.random.Random

//  lateinit, is type checking, as type cast
fun main(args: Array<String>) {
    val value = "aniki"
    if (value is String) {
        println("this is a string ${value}")
    }

    val valueCar = CarBase()
    if (valueCar !is BMW) {
        println("this is not a bmw")
    }
    val bmCar = CarBase()
    if (bmCar is BMW) {
        println("this is a bmw")

        bmCar as BMW
    }

    val car = getCar()
    //null safe type cast
    val wowCar: BMW? = car as? BMW;


    //lateinit can be used in dependency injection and unit test
    //this is the idea but not a good example
    lateinit var networkservice: String
    networkservice = getNetworkService()
    println(networkservice)

    //for memory optimization we can use lazy
    //only initialize when they are needed
    val someLargeVariable: String by lazy { "A large value" }

    val random = Random.nextInt()
    if (random % 2 == 0) {
        println(someLargeVariable)
    }
}


fun getNetworkService(): String = "Network service"

open class CarBase {}

class BMW : CarBase() {
    fun drive() {
        println("driving my bmw")
    }
}

fun getCar(): CarBase = BMW()
