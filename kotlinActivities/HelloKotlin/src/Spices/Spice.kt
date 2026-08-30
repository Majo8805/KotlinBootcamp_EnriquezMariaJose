package Spices

sealed class Spice (val name: String, val spiciness: String = "mild", color: SpiceColor) : SpiceColor by color {

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

    abstract fun prepareSpice()

}
