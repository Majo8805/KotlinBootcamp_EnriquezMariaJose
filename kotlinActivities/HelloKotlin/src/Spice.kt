class Spice (val name: String, val spiciness: String = "mild"){

    val heat: Int
    get() = when (spiciness) {
        "mild" -> 1
        "medium" -> 2
        "spicy" -> 3
        "very spicy" -> 4
        "extremely spicy" -> 5
        else -> 0
    }

    init {
        println("$name $spiciness $heat")
    }

}

fun makeSalt(): Spice {
    return Spice("Salt")
}