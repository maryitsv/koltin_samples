

fun main(args : Array<String>){

    //** Null values
    println("nullability")
    // null value is called the billion dollar mistake
    // not valies present
    // if you use a variable with a null values your program will crash with a null pointer exception (NPE)
    // kotlin guards against null values, if we want to have a NPE we need to be specific
    // using the ? operator

    val herName:String = "Lily"
    val hisName:String?=null
    // if a variable can not be null you need to put a value
    // if a variable can be null we need to set as null
    println(herName)
    println(hisName)

    /*
     val hisName:String?
     println(hisName) -> compilation error because we need to have a value
    */

    var catName: String? ="Chonkers"
    println(catName?.length.toString())
    // catName?.length?.toString we can chain the nullable with ?
    catName = null
    println(catName?.length.toString())
    // if we try to get the length of a null we got null

    // arithmetic on null values
    // we can not use the classic operator for not null values
    // +     ?.plus()
    // -     ?.minus()
    // *     ?.times()
    // /     ?.div()
    // %     ?.rem()

    val a : Int? = 10
    println("a plus ${a?.plus(5)}")
    println("a minus ${a?.minus(3)}")
    println("a times ${a?.times(3)}")
    println("a div ${a?.div(3)}")


    var sa :String? ="This is just an example"
    println(sa?.substring(2,7))

    var da: Double? = 21.1
    var db = da?.times(2)
    println(db?.toFloat())

    // println("write name")
    // var nameInput = readLine() // this can return a null
    // println(nameInput?.length)

    // ?: elvis operator

    var lizardName:String? = null
    // lizardName = "teresa"
    println(lizardName?:"this lizard has not name")
    println(lizardName?.length)
    println(lizardName?:"Belen".length) // elvis asegura que tenemos valor asignado

    // not null assertions
    // !!.  a developer guarantee that the variable is not null: "trust me"
    // WARNING: this bypasses all the language checks for null safety can trigger a program crash

    //val cocoName:String? = null
    //println(cocoName!!.length)
    /*
    Exception in thread "main" java.lang.NullPointerException
	at HWKt.main(HW.kt:71)
    */

    println("input msg")
    var msg = null?:"no msg"
    println("return ${msg}")
}


