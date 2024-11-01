import kotlin.random.Random

const val URL_LINK = "google.com"

fun main(args : Array<String>){
    println("Maryit \" hey \" \\  !" )
    // Comentarios
    // comment single line
    /*
    this is a multilines comment
     */

    // Typos de datos
    // String "lo que queramos"
    // Char 'esto es un char'
    // Variables

    var dogs = 3
    var tcShowsWatched = "many"
    var initialLetter = 'a'

    var age = 25
    age = 34
    var newAge = age+1
    println("new age: "+ newAge)

    // can not change a variable type
    // age = "many" -> Error

    // immutable val
    // mutables var

    val color = "blue"
    // color = "red" // error porque es inmutable VAL, si queremos que mute toca ponerla como var

    // Variable names
    // can contain letter numbers and underscore _
    // must start with letter or underscore
    // can not use keywords
    // usar camelCase por convención


    val toPrintSlash = "Two types slashes \\ and /"
    println(toPrintSlash)

    val toPrintGoogle = "http://www.google.com"
    println(toPrintGoogle)


    val bunny1 = "(\\(\\"
    val bunny2 = "(-.-)"
    val bunny3 = "(\")(\")_o"

    println(bunny1)
    println(bunny2)
    println(bunny3)


    //string functions
    //.length
    //.capitalize
    //.decapitalize
    // trim
    val myPet = "crocodrile"
    println(myPet.length)
    println(myPet.capitalize())

    var myKidPet = "Octupus"
    println(myKidPet.decapitalize())
    println("getting position 4,5 of "+myPet+" : "+myPet.get(4) + myPet[5])
    println("getting substring "+ myPet.substring(3))

    println(myPet.filter {  it !== 'o' })

    //template string usar el $ y {}
    var pet = "Belen"
    var otociclos = 10
    var gupies = 4
    println("my mascota se llama $pet, y tengo ${otociclos + gupies} peces")

    val catName = "my cat's name is \"Fluffy\"";

    println("The catname variable lenght is ${catName.length}")

    val myCar = "my car wont star"
    println(myCar.substring(0,2)+myCar.substring(6,16))

    val apples = 3
    val oranges = 6

    println("available = ${apples+oranges}")

    val client = "Mary"
    val product = 3
    val price = 30
    println("the client $client needs to pay ${product*price}")


    //constant
    //by standar capitalized, and located out of functions
    //readline can return null
    println("please input your age")
    var userInput = "10"// readLine()?:""
    println("you wrote ${userInput.toInt()-1}")


    var random = Random(100);
    println(random.nextInt(50))
    println(Random.nextInt(20))
    println(Random.nextInt(1,10))

    println("please enter your name")
    val userNameInput = readLine()?:""
    println("Welcome $userNameInput")
    println("please enter your aspiration salary montly")
    val salaryInput= readLine()?:""
    println("Salary propousal  ${salaryInput.toInt()*5}")

    println("Please enter birth year")
    var ageUser = readLine()?:""
    println("you are ${2024 - ageUser.toInt()} old")

    // todas las variables tienen un tipo si no se puede inferir el tipo se debe especificar
    // todo se puede convertir a string
}

