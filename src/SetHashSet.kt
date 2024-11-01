

fun main(args : Array<String>) {
    // Set HashSet
    // functions

    var a = setOf<Int?>(41, 6, null, 34, 6, null) // -> [6, 34, 42]
    println(a)

    var b = setOf<String>()
    println(b)


    println("------------------------")
    //mutable hash

    val numbers = hashSetOf<Int?>(3, 4, null, 83, 56)
    val noNumbers = hashSetOf<Int>()
    println(noNumbers)
    println(numbers)
    numbers.add(44)
    println(numbers)

    val newNumbers = setOf(78, 100, 2)
    numbers.addAll(newNumbers)
    println(numbers)
    numbers.remove(100)
    println(numbers)
    numbers.removeAll(newNumbers)
    println(numbers)


    val colors = hashSetOf<String>()
    val colortList = listOf("red", "green")

    colors.addAll(colortList);
    println(colors)

    println("------------------------")

    val numbers2 = setOf(3, 6, 4, null, 8)
    println(numbers2.size)
    println(numbers2.contains(8))
    println(numbers2.contains(0))
    val newNumbers2 = setOf(4, null)
    println(numbers2.containsAll((newNumbers2)))
    println(numbers2.isEmpty())


    val numbers3 = hashSetOf(3, 4, null, 83, 56)
    val numbers4 = hashSetOf(56, null, 3, 90, 100)

    println(numbers3.intersect(numbers4))
    numbers3.clear() // works on all mutable collections
    println(numbers3)

    val numerosPrimos = setOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29)

    println("Is the 21 a prime? :${numerosPrimos.contains(21)}")
    println("Is the 13 a prime? :${numerosPrimos.contains(13)}")


    var myDrinks = hashSetOf("coffee", "orange juice", "water", "te")
    var hisDrinks = hashSetOf("coffee", "water", "te", "banana juice")
    println(myDrinks.retainAll(hisDrinks))//[coffee, water, te]
    println(myDrinks)
}


