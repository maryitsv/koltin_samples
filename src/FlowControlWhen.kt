

fun main(args : Array<String>) {
// control flow when
    var animal = "crocodile"
    var action: String = ""
    when(animal){
        "cat" -> {
            action = "feed it"
        }
        "dog"->{
            action = "pet it"
        }
        "crocodile" -> {
            action = "run away"
        }
        else -> {
            action = "google it"
        }
    }

    println("when find $animal your should $action")


    var result = ""
    var number = 2345
    when ( number%2 ){
        0 -> result = "number is even"
        1 -> result = "number is odd" //impar
    }

    println("the $number is $result")


    var animal2 : String = "Ant"
    var action2 = when(animal2){
        "cat"-> "pet it"
        "dog"-> "feed it"
        "crocodile"->{
            println("ui que susto")
            "run away"
        }
        else-> "google it"
    }

    println("When find a $animal2 then $action2")

    val month="oct"
    val days = when(month){
        "January", "March", "May" -> 31
        "Febrary" -> 28
        else -> 30
    }
    println("The month of $month has $days")

    // capture the subject
    // crea la variable lenght y la asigna en el when solo existe en el when
    val name="michelle"
    when (val lenght = name.length){
        in 1..5 -> println("name is short $lenght")
        in 6..9 -> println("name is medium $lenght")
        else -> println("name is large $lenght")
    }

}
