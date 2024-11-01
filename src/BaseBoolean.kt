fun main(args : Array<String>){

    val isDay = true
    val isNight = false
    println("booleans very memory efficient, enable logical operations, enable program flow control")

    println("is day $isDay")
    // operators logica
    // && and
    // || or
    // ! not
    println("and :"+(true && true))
    println("or :"+(false || true))
    println("or :"+(false || false))
    println("not false: "+(!false))

    // comparison operators
    val a=5
    val b=1
    println("$a > $b will return ${a > b}" )// greater than
    println("$a < $b will return ${a < b }")//smaller than
    println("$a >= $b will return ${a >= b}" )// greater or equal
    println("is $a == $b return ${a == b}")// equality in value
    println("is $a != $b return ${a != b}")// not equality in value
}

