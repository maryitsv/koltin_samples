

fun main(args : Array<String>) {
    // List and ArrayList
    // list functions
    // ArrayList functions


    var colors = listOf<String?>("yellow","yellow","blue","red",null,"transparent")
    // una lista puede tener nulos entones debemos validarlos cuando accedemos los valores
    println(colors)
    println("position 0 : "+ colors[0])
    println("position 2: "+ colors[2])
    // println(colors[9]) // exception  java.lang.ArrayIndexOutOfBoundsException: Index 9 out of bounds for length 6
    println("colors get 3: "+colors.get(3))


    var emptyList = listOf<String>();// si tenemos una lista vacia hay que especificar el tipo
    println(emptyList)


    ////////// mutable array
    val colorsArray: ArrayList<String> = arrayListOf("blue","red");
    println(colorsArray)
    colorsArray.add("purpleMix")
    println(colorsArray)

    val moreColors = arrayListOf("green","brown","pink")
    colorsArray.addAll(moreColors)
    println(colorsArray)
    colorsArray.add("purpleMix")
    println(colorsArray)
    colorsArray.remove("purpleMix") //delete the first instance of purpleMix
    println(colorsArray)
    colorsArray.removeAll(moreColors)
    println(colorsArray)
    colorsArray.removeAt(0)
    println(colorsArray)


    val noColor = arrayListOf<String>()
    println(noColor)


    // ejercicios
    val animals= listOf("dog","cat","elephant","hippo")
    println(animals.size)
    println(animals[0])


    val customers = arrayListOf("ruby","ana","gustavo")

    val newCustomers = arrayListOf("luis","angela","marina")
    customers.addAll(newCustomers)
    println(customers)

    customers.remove(newCustomers[2])
    println(customers)

    // functions list
    println("List functions --------------------")
    val colorsTest = listOf("blue","red","blue","green","red")
    println(colorsTest)
    println("size "+colorsTest.size)
    println("contains red "+ colorsTest.contains("red"))
    println("containes black "+colorsTest.contains("black"))

    val newColors = listOf("blue","red")
    println(colorsTest.containsAll(newColors))
    println("index of red "+colorsTest.indexOf("red"))

    println("Array list functions--------------------")

    val fruits = arrayListOf("apple", "banana", "grapes", "avocado")
    println(fruits)
    fruits.set(1,"strawberries")
    println("after a set in 1 "+fruits)

    val subFruits = fruits.subList(1,2)// [a,b) arranca en el 1 y termina en el 2 pero no incluye la posicion 2
    println("subList "+subFruits)
    println(subFruits::class.java)
    fruits.clear()
    println("after a clear " + fruits)
    println("is empty : "+fruits.isEmpty())

    println("Practice list functions--------------------")

    val winners = listOf("Gustavo","Jon","Michael","Alex");
    println(winners)
    println("Michel finished on position ${ winners.indexOf("Michael") +1}")


    val colorsRequired = listOf("red","blue","green")
    val colorAvailables = listOf("blue")

    println("can print ? "+ colorAvailables.containsAll(colorsRequired))

    var ingredients = arrayListOf("chicken","egg","mozarella","pepper")
    val mozarellaPosition:Int  = ingredients.indexOf("mozarella")
    println(mozarellaPosition)
    ingredients.set(mozarellaPosition,"blue cheese")
    println(ingredients)
}


