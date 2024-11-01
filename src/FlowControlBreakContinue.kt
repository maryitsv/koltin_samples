

fun main(args : Array<String>) {
    // break
    // continue
    // labels
    println("--------------break end the for if the break is called")
    val onlyEvenNumbers = arrayListOf(2,4,6,7,8,10)
    for(number in onlyEvenNumbers){
        if (number % 2 != 0) break
        println("half of $number is ${number / 2}")
    }

    println("--------------continue just skype one")
    for(number in onlyEvenNumbers){
        if (number % 2 != 0) continue
        println("half of $number is ${number / 2}")
    }


    // labels
    // are not a good development practice
    // a label is used to mark a position in code that you can jump to
    // can be used with break and continue

    loop@for(i in 1..10){

        for ( j in 1.. 10){
            if ( i%3 == 0 )
                break@loop
            print("$i,$j \t")
        }
        println()
    }
}
