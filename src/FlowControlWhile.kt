

fun main(args : Array<String>) {

    // while loops, do while nested while loops
    var puzzlePieces = 10
    var piecesPlaces = 0

    while(piecesPlaces< puzzlePieces){
        piecesPlaces++
        println("places pieces $piecesPlaces")
    }

    // do while the condition is evaluated at the end
    println("------------------------")
    puzzlePieces = 10
    piecesPlaces = 0
    do {
        piecesPlaces++
        println("places pieces $piecesPlaces")
    } while (piecesPlaces < puzzlePieces)


    var i=1
    var j=1
    while ( i <= 5 ) {
        while ( j <= 5 ) {
            print("$i,$j \t")
            j++
        }
        i++
        j=0
        println()
    }
}
