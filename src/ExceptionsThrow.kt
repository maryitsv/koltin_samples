
fun main(args : Array<String>) {
    //throw
    // esta es la manera de generar sus propias exceptions
    // detectar un stado del que nnuestro programa no se pueda recuperar
    // use el throw

    println("write a msg and see the error")
    var test = readLine()
    throw IllegalStateException("Aqui lanzamos una excepcion manual")
}
