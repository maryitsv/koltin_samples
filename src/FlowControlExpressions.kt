

fun main(args : Array<String>) {
// expressions

    val haveCat = true
    val haveCatFood = true
    if (haveCat && haveCatFood) {
        println("Cat happy")
    }

    val age=13

    if (age >= 18){
        println("you can drink")
    } else {
        println("too young")
    }

    var favoritePet= "cat"
    var availablePet = listOf("dog","cat","horse")

    if( favoritePet in availablePet) {
        println("Pet $favoritePet is available")
    }


    if ("mouse" !in availablePet){
        println("Not mouse at home yupi!!!")
    }

    if(35 !in 0..9){
        println("my age is not in the range for kids")
    }



    // booleans returning functions
    val animals = arrayListOf<String>()
    if (animals.isEmpty()){
        animals.add("dogs")
    }
    if (animals.add("hourse")){// some functions returns boolean can be used on the if statement
        animals.add("dinasour")
    }
    println(animals)
}


