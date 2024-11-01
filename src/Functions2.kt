

fun main(args : Array<String>) {
    // Functions overloading
    // Scope
    // Vararg variable arguments, as many arguments as we want
    // Local functions


    // overloading
    // two functions can have the same name
    // if they have the different numbers or types of parameters
    println( multiply(3))
    println( multiply(3,5))

    sayHello2("jon")
    sayHello2((listOf("jon","mari","karol")))

    // scope
    // a variable defined inside a function only exists in that function

    example()
    // println ("I have $flowers flowers") //Error flowers does not exists in this scope

    // varargs
    sayHello3("Aniki","Rous","Herma")

    // local functions
    listAnimals()
}

fun multiply(number:Int) = number*2
fun multiply(number:Int, multiplier:Int) = number*multiplier

fun sayHello2(person: String) {
    println("hi $person")
}

fun sayHello2(people: Collection<String>){
    for(person in people){
        println("Hi here $person")
    }
}

fun example(){
    val flowers= 5;
    println ("I have $flowers flowers")
}

fun sayHello3(vararg names:String){
    for (name in names){
        println("hello $name")
    }
}

fun listAnimals(){
    fun listOneAnimal(animal: String){
        println("list one "+animal)
    }

    val myAnimals = arrayListOf("cat","dog","mouse","chicken")

    for (animal in myAnimals){
        listOneAnimal(animal)
    }
}