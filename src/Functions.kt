

fun main(args : Array<String>) {
    // functions

    for(i in 1..3){
        sayHello(i.toString())
    }

    var i = 5

    do{
        i--
        printAlphabet()
    } while(i > 0)


    double(10)

    for(i in 1..10){
        double(i)
    }

    val people: List<String> = listOf("Gustavo","Ana","Angela")
    sayHelloToPeople(people)

    double(5,"El doble de 5 es")
    double(5,"5*5=")

    val r=10
    println("A circle with radius $r has area ${calculateCircleArea(r)}")

    val peopleToHi = arrayListOf("Ana","Wilson","Mar")
    for(person in peopleToHi) {
        println(personalizedGreeting(person))
    }

    println("Area con shorthand for 5 = ${calculateAreaShort(5)}")
}

// short hand with return
fun calculateAreaShort(radius:Int) = 3.1416*radius*radius


fun personalizedGreeting(person:String): String {
    val greeting = when(person[0]) {
        'A'-> "Are you ok $person"
        'W'-> "What's up $person"
        else-> "hi $person"
    }
    return greeting
}

fun calculateCircleArea(radius:Int):Double{
    val pi = 3.1416
    return pi*radius*radius
}

fun sayHelloToPeople(people:Collection<String>){
    for (person in people){
        println("hello $person")
    }
}

fun sayHello(i:String){
    println("hello everyone $i")
}

fun printAlphabet(){
    println("a,b,c,d,e,f,g,h,i,j,k,l,m,n,ñ,o,p,q,r,s,t,u,v,w,x,y,z")
}


fun double(number:Int, message:String = "Double is"){
    println("$message ${number*2}")
}