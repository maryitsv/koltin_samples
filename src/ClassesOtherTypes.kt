import kotlin.random.Random

//other types data class enum sealed  nested class
fun main(args : Array<String>) {
    // Data class
    // common create classes just for storing data
    // primary constr ha at least one parameter
    // all primary need a var o val
    // can have body but not required
    // similar pojo java

    val user =User(name = "ana", email = "sa", password ="aniki")

    val user2 =User(name = "ana", email = "sa", password ="aniki")

    println(user )
    println( user == user2,)
    println( user.equals( user2))
    println(user.toString() )
    //equal compara valores no el obj

    val user3 = user.copy(email="otheremail")// copia el obj y le asigna la nueva propiedad
    println(user3 )


    val customers : ArrayList<Customer> = arrayListOf<Customer>()
    customers.add(Customer("alice","al",7))
    customers.add(Customer("maria","al",3))
    val newCustomer = customers[1].copy(email = "maria@gmail.com")
    customers.add(newCustomer)
    println(customers)


    /*enum
     * define a collection of constants
     * the constant defined are objects
     * constants have properties name ordinal
     *
     * */


    val color =  Colors.RED
    decide(color)

    var currentState = GameStates.STARTED
    println("${currentState.ordinal+1} $currentState")
    currentState = changeGameState(currentState)
    println("${currentState.ordinal+1} $currentState")
    currentState = changeGameState(currentState)
    println("${currentState.ordinal+1} $currentState")


    val olympics = Olympics()
    println(olympics.getMedal(2))
    println(olympics.getMedal(1))
    println(olympics.getPosition(Medal.GOLD))

}

fun changeGameState(currentState: GameStates) = when(currentState) {
    GameStates.STARTED-> GameStates.PLAYING
    GameStates.PLAYING-> GameStates.GAMEOVER
    GameStates.GAMEOVER-> GameStates.STARTED
}


fun decide(color: Colors){
    when(color) {
        Colors.RED-> println("you have chosen red")
        Colors.GREEN-> println("you have chosen green")
    }
}
enum class Medal( position: Int) {
    GOLD(1),
    SILVER(2),
    BRONZE(3),
    NONE(4)
}

class Olympics{
    fun getMedal(position: Int): Medal = when(position){
        1-> Medal.GOLD
        2-> Medal.SILVER
        3-> Medal.BRONZE
        else -> Medal.NONE
    }

    fun getPosition(medal: Medal):Int  {
        return medal.ordinal + 1
    }
}

enum class GameStates{
    STARTED,
    PLAYING,
    GAMEOVER
}
enum class Colors(val timesUsed: Int) {
    RED(34), // ordinal 0
    GREEN(19) // ordinal 1
}

data class  User(
        val name: String,
        val email: String,
        val password: String
)


data class Customer(
        val name: String,
        val email: String,
        val productBought: Int
)