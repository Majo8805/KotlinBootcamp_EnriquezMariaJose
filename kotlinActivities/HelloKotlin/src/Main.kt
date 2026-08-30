import Game.Game
import Game.orderFunction
import Spices.Curry
import Spices.SpiceContainer
import Spices.YellowSpiceColor
import books.Book
import books.Puppy
import buildings.Building
import buildings.Wood

fun main() {
//    dayOfWeek()
//    println(" ")
//    hourOfDay()
//    println(" ")
//    val fortune = getFortuneCookie()
//    println("Your fortune is: $fortune")
//    println(" ")
//    println(canAddFish(10.0, listOf(3, 3, 3)))
//    println(canAddFish(8.0, listOf(2, 2, 2), hasDecorations = false))
//    println(canAddFish(9.0, listOf(1, 1, 3), 3))
//    println(canAddFish(10.0, listOf(), 7, true))
//    println(" ")
//    whatShouldIDoToday("sad", "Sunny", 40)
//    println(" ")
//    println(rollDice(12))
//    println(rollDice2(6))
//    println(rollDice(0))
//    println(" ")
//    gamePlay(rollDice2(12))
//    println(" ")
//    val spice = SimpleSpice()
//    println(spice.name)
//    println(spice.heat)

//    val spice = Spice(name = "Pepper", spiciness = "spicy")
//
//    val spices = listOf(
//        Spice("Curry", "mild"),
//        Spice("Pepper", "medium"),
//        Spice("Cayenne", "spicy"),
//        Spice("Jalapeño", "very spicy"),
//        Spice("Habanero", "extremely spicy")
//    )
//
//    val spicyOrLess = spices.filter { it.heat <= 3 }
//    val salt = makeSalt()
//
//    println(spicyOrLess)
//    println(salt)

//    val curry = Curry("very spicy")
//    val curryJar = SpiceContainer(curry)
//    curryJar.label


//    val libro = Book("RandomBook", "Pepe", 2020, 15)
//    println("Here is your book " + libro.title + " written by " + libro.author + " in " + libro.year)
//
//    val allBooks = setOf("Romeo and Juliet", "Hamlet", "Macbeth")
//    val library = mapOf(allBooks to "William Shakespeare")
//    val isHamlet = library.any { it.key.contains("Hamlet") }
//    val moreBooks = mutableMapOf("RandomBook67" to "Pepito")
//    moreBooks.getOrPut("Hamlet") { "William Shakespeare" }


//    val toyBook = Book("toyBook", "IDK", 2020, 15)
//    val puppy = Puppy()
//
//    while (toyBook.pages > 0) {
//        puppy.playWithBook(toyBook)
//        println("There are ${toyBook.pages} pages left")
//    }


//    val wood = Wood()
//    val building = Building(wood)
//    building.build()


//    val game = Game()
//    println(game.path)
//    game.north()
//    game.east()
//    game.south()
//    game.west()
//    game.end()
//    println(game.path)


//    val numbers = listOf(1,2,3,4,5,6,7,8,9,0)
//    val result = numbers.orderFunction { it % 3 }
//    println(result)

    val game = Game()
    while (true) {
        print("Enter a direction: n/s/e/w:")
        game.makeMove(readLine())
    }

}