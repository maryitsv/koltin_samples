

fun main(args : Array<String>) {
    // control flow If
    // if must be used with boolean expressions
    // if can return a value and assign
    // there is a shorthand if expression
    /*
        val night = true
        if (night) {
            println("Sleep, it´s night time")
        } else {
            println("be active, it´s day time")
        }
    */

    var clientFunds = 100
    val price = 50
    var clientProductos = 0

    if (clientFunds > price){
        println("we can buy")
        clientFunds -= price
        clientProductos += 1
        println("clientProductos ${clientProductos} clientFunds ${clientFunds}")
    } else {
        println("you have insufficient funds")
    }


    // short hand if
    // curly brackets can be ommitted if there is only one expresion

    var isEven : String? = null
    val number = 24

    if (number%2 == 0)
        isEven = "even"
    else
        isEven = "odd"

    //shorthand this return the value and assing
    var isOdd = if(number%2 == 0) "even" else "odd"

    println("${number} isEven? ${isEven}")
    println("${number} isOdd? ${isOdd}")



    println("please enter animal")
    var animal = "crocodile" //readLine()
    val action = if(animal=="dog"){
        "pet it"
    } else if (animal=="cat"){
        "feed it"
    } else if (animal =="crocodile"){
        "run away"
    } else {
        "google it"
    }

    println("$animal you should $action")
}


