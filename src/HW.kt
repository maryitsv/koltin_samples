import java.math.BigDecimal
import kotlin.random.Random


fun main(args: Array<String>) {
    //threats are resource intensive
    //coroutines are lightweight threads
    //use thread pools
    //deferred a future result of a coroutine
    //dispatcher manage which threads the coroutine runs on
    //functions that can be run in a coroutine can be suspended
    // corrutines helps with synchronisation, multithreading

    val b1 = BigDecimal("987654336.0")
    val f= java.lang.Float.parseFloat("987654336.0")
    println("float $f")
    val b2 = BigDecimal("9.8765434E8")
    println(b1.compareTo(b2))



}