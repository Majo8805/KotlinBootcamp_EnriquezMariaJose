package buildings

open class BaseBuildingMaterial(val numberNeeded: Int = 1) {

}

fun <T : BaseBuildingMaterial> isSmallBuilding(building: Building<T>) {
    if (building.actualMaterialsNeeded < 500) {
        println("small building")
    } else {
        println("large building")
    }
}
