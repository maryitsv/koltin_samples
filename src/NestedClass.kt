import kotlin.random.Random

//  nested class
fun main(args : Array<String>) {

    val myCar = CarEngine()
    myCar.Engine().run()
}

class CarEngine {
    var speed =100
    fun drive() {
        println("drive at speed $speed")
    }

    inner class Engine{
        val rpm = 1000

        fun run(){
            println("Engine is running at $rpm rpm")
            this@CarEngine.speed =50
            this@CarEngine.drive()
        }
    }
}


