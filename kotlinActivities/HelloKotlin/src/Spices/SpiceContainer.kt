package Spices

data class SpiceContainer(val spiceType: Spice) {
    val label: String = spiceType.name

}
