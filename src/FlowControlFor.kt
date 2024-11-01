

fun main(args : Array<String>) {

    // for loop, recorrer colleciones
    val animals = arrayListOf("cat","dog","mouse","bear")

    for(animal:String in animals) {
        // do something
        println("Feed the $animal")
    }

    for(i in 1..12){
        val month = when (i){
            1->"January"
            2->"February"
            3->"March"
            4->"April"
            5->"May"
            6->"June"
            7->"Jul"
            8->"Aug"
            9->"Sep"
            10->"Oct"
            11->"Nov"
            12->"Dec"
            else -> ""
        }
        println("Month $i  is $month")
    }


    for (i in 1..3) {
        println("Strike #$i")
    }
    println("OUT!!!")

    for (i in 10 downTo 0){
        println(i)

        when(i){
            9-> println("Start your engines")
            6-> println("On your marks")
            3-> println("Get set")
            0-> println("Go!")
        }
    }
    print("-------------------")
    for ( i in 10 downTo  0 step 3) {
        println(i)
    }

    // nested for loops

    for(i in 1..5){
        for(j in 1..5){

            if(i==j){
                print("dia \t")
            } else {
                print("$i,$j \t")}
        }
        println("")
    }
}
