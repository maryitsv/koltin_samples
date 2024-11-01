
fun main(args : Array<String>){

    println("Arithmetic operators")
    var a= 5
    var b= 10
    //var c: Float = a.toFloat()/b.toFloat()
    var c = a%b
    println("C the result is $c")

    // operators:
    //a+b
    //a-b
    //a/b
    //a.toFloat()/b.toFloat() si quiero resultado flotante hay que ser explicito
    //a++ incremento
    //a%b modulo
    //a--  decremento

    var dogs = 2
    println("I have ${dogs++} result is the same, because increment after use it")
    println("I have ${dogs} ")
    println("I have ${++dogs} the result is incremented then used")

    var name="ana victoria"
    var lastName="espinosa sanchez"
    var fullName = name+" "+lastName;
    println("nombre $fullName")


    var oa: Short = 6
    var ob: Int = 32
    var oc = oa*ob
    println("the result is the largest type of operators " +oc::class.java)

    //augmented assignment operator
    var bikes = 5
    bikes+1 // este se aumenta pero no cambia la variable solo incrementa y retorna
    println("bikes $bikes")
    bikes+=2 // este cambia la variable incrementa y asigna
    println("bikes $bikes")
    bikes*=10
    println("bikes $bikes")
    bikes/=10
    println("bikes $bikes")
    bikes -=2
    println("bikes $bikes")
    bikes%=3
    println("bikes $bikes")

    /* ejercicio
    var a=76.254
    var b=3.867

    println("Adition: ${a+b}")

    println("Substraction: ${a-b}")

    println("Multiplication: ${a*b}")

    println("Division: ${a/b}")

    println("Remaninder: ${a%b}")
*/

}

