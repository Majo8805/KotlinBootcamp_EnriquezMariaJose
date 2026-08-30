package Spices

class Curry(spiciness: String) : Spice("Curry", spiciness, YellowSpiceColor), Grinder  {

    override fun prepareSpice() {
        grind()
    }

    override fun grind() {
    }

}