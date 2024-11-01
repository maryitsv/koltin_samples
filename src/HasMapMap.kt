

fun main(args : Array<String>) {
// un mapa es un diccionario
    var count = mapOf(Pair(1,"one"), Pair(5,"five"))
    println("Count "+count)

    var noCount = mapOf<Int,String>() //key tye, value type
    println("noCount "+noCount)

    println(count.get(5)) //aqui obtiene el valor five get by key
    println(count.keys)
    println(count.values)

    var numeros = hashMapOf<Int, String>(Pair(3,"tres"),Pair(4,"cuatro"),Pair(1,"uno"))
    numeros.put(6,"seis")
    numeros[4] = "cuatro"
    println(numeros)

    var moreNumeros = hashMapOf(Pair(18,"Diesyocho"),Pair(21,"Ventiuno"))
    numeros.putAll(moreNumeros)
    println(numeros)
    numeros.remove(18)
    println(numeros)

    numeros.replace(4,"CUATRO")
    println(numeros)
    numeros.clear()
    println(numeros)


    numeros = hashMapOf<Int, String>(Pair(3,"tres"),Pair(4,"cuatro"),Pair(1,"uno"))
    println(numeros.size)
    println(numeros.containsKey(3))
    println(numeros.containsKey(90))
    println(numeros.containsValue("tres"))
    println(numeros.containsValue("noventa"))
    println(numeros.isNotEmpty())
}


