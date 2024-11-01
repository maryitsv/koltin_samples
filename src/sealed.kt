import kotlin.random.Random

//other types data class enum sealed  nested class
fun main(args : Array<String>) {

    val plant : Plant =  getPlant();

    when (plant){
        is Fruit -> println("sweet fruit")
        is Vegetable -> println("tasty vegetable")
    }
}

fun getPlant(): Plant = Apple()

abstract  class Plant

sealed class Fruit: Plant()

sealed class Vegetable : Plant()

class Apple: Fruit()

class Tomato: Vegetable()