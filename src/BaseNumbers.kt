
fun main(args : Array<String>){
    var price = 15
    var items = 7
    var totalPrice = price*items
    println("Total $totalPrice" )

    /* enteros
    * byte      -128 127
    * short     -32768 32767
    * int       -2.147.483.648(-2)a la 31 2.147.483.647
    * long      (-2)¬64
    *
    *
    * decimales
    *
    * float 6-7 digitos decimales
    * doble 15-16 digitos decimales
    * */

    var itemstoBuy = 5 //int
    var numberOfPeople = 7000000000 //long
    var priceItems = 29.99 //double
    var pi = 3.1415926535 // double

    println("itemstoBuy : "+itemstoBuy::class.java)
    println("numberOfPeople : "+numberOfPeople::class.java)
    println("priceItems : "+priceItems::class.java)
    println("pi : "+pi::class.java)

    var test: Long = 5
    println("test : "+test::class.java)

    test = 10000000000
    println("test : "+test::class.java)


    println("please enter number")
    var userIn = "1"// readLine()?:""
    var factorMultiplication = 3.0
    var resultado = userIn.toInt()*factorMultiplication
    println(" lo que viene en los ingresos ${resultado} ${resultado::class.java}")


    // podemos forza un tipo en el valor o enla declaracion

    val dogs: Byte=3
    println("dogs ${dogs::class.java}")

    val newLife = 42L //long
    println("newlife ${newLife::class.java}")

    val moreMoney = 6.99F //float
    println("moreMoney ${moreMoney::class.java}")


    // type conversions

    // a variable can be converted into a different type
    val cats = 3 //int
    val catsLong = cats.toLong()

    println("cats -> ${cats::class.java}, catslong -> ${catsLong::class.java}")

    // if we convert a long to a short we can lost information
    val people = 7000000000
    val fewPeople = people.toInt() // -1589934592 los datos se pieden y queda un valor corrupto
    println(fewPeople)

    println( "podemos pasar a string ${people.toString()} ${moreMoney.toString()} ${catsLong.toString()}")


    println("please enter number")
    var userIn2 = readLine()?:"1"
    /*
    var myByte =userIn2.toByte();
    println("to byte ${myByte} type ${myByte::class.java}")

    var myShort =userIn2.toShort();
    println("to short ${myShort} type ${myShort::class.java}")

    var myInt =userIn2.toInt();
    println("to int ${myInt} type ${myInt::class.java}")

     */

    var myLong =userIn2.toLong()
    println("to myLong ${myLong} type ${myLong::class.java}")

    var myDouble =userIn2.toDouble();
    println("to myDouble ${myDouble} type ${myDouble::class.java}")

}

