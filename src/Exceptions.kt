import java.lang.Exception

fun main(args : Array<String>){
    // exceptions
    // try catch para manejar las excepciones
    println("write a letter waiting for a number")
    var test = readLine()
    try {
        println(test?.toInt())
    } catch (e:Exception){
        println("An exception has occurred ${e.localizedMessage}")
        println(e.stackTraceToString()) // es una buena practica almacenar el log de que hubo un error
        // nos permite manejar la excepcion y que no pare la ejecucion
    } finally {
        // esto se ejecuta cuando termina independientemente de si se fue por el catch o por el happy path
        // classic example a resource that is very large in memory
        // access to database, if its fails the database instance will remain in memory
        // this can cause the garbage get full and the program to be slow
        // then we should use the finally to free up resources
        println("La ejecucion ha sido completada")
    }
    /*
Exception in thread "main" java.lang.NumberFormatException: For input string: ""
at java.base/java.lang.NumberFormatException.forInputString(NumberFormatException.java:67)
at java.base/java.lang.Integer.parseInt*/
}


