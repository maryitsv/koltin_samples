
fun main(args : Array<String>) {
    //lambdas
    //higher order functions


    //lambda is an anonymous function(has no name)
    val myLambda = {name:String -> println("Hellow $name") }
    println(myLambda("maryit"))

    //HOF is a function that takes another function as a parameter

    var friends = arrayListOf("Mary","Emily","Mike")
    sayHello4(friends, myLambda)
    sayHello4(friends, {name:String -> println("Hellow $name") }) // send as parameter
    sayHello4(friends) {name:String -> println("Hellow $name") } // outside the parentesis also

    var numbers= arrayListOf(20,4,60,9,10,11,34,45)
    println(numbers)
    var newNumbers = update(numbers) {number -> number/10}
    println(newNumbers)


    // common HOFs

    val clients = listOf("Anna","Bob","Carol","David")
    // clients.forEach{println("Hello $it")}

    clients.filter { it.length<5 }.forEach {println("Allow shortnames $it")}

    val sizes = clients.map{ it.length}
    println(sizes)

    val sorted = clients.sortedBy{it.length}
    println(sorted)


    val max = clients.maxBy { it.length }
    println(max)

    val min = clients.minBy { it.length }
    println(min)

}

fun update(numbers: ArrayList<Int>,lbd:(Int)->Int): ArrayList<Int>{
    for (i in 0..numbers.size-1){
        if(numbers[i]%2==0){
            numbers[i]= lbd(numbers[i])
        }
    }
    return numbers;
}

//unit means the function does not return anything
fun sayHello4( names:ArrayList<String>, doSomething:(String)->Unit) {

    for (name in names ){
        doSomething(name)
    }
    println("------------")
}
