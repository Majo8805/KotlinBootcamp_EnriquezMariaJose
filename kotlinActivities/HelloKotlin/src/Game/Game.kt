package Game

class Game {
    var path = mutableListOf(Directions.START)

    val north = { path.add(Directions.NORTH) }
    val south = { path.add(Directions.SOUTH) }
    val east = { path.add(Directions.EAST) }
    val west = { path.add(Directions.WEST) }
    val end = {
        path.add(Directions.END)
        println("Game Over")
        println(path)
        path.clear()
        false
    }

    fun move(where: () -> Boolean ) {
        where()
    }

    fun makeMove(command: String?) {
        when (command) {
            "n" -> move(north)
            "s" -> move(south)
            "e" -> move(east)
            "w" -> move(west)
            else -> move(end)
        }
    }

}

fun List<Int>.orderFunction(operacion: (Int) -> Int): List<Int> {
    val resultado = mutableListOf<Int>()

    for (elemento in this) {
        if (operacion(elemento) == 0) {
            resultado.add(elemento)
        }
    }

    return resultado
}

