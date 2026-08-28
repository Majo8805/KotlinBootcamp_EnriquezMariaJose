import java.util.*

fun dayOfWeek() {
    println("What day is it today?")
    when (Calendar.getInstance().get(Calendar.DAY_OF_WEEK)) {
        1 -> println("Today is Sunday")
        2 -> println("Today is Monday")
        3 -> println("Today is Tuesday")
        4 -> println("Today is Wednesday")
        5 -> println("Today is Thursday")
        6 -> println("Today is Friday")
        7 -> println("Today is Saturday")
    }
}

fun hourOfDay() {
    if (Calendar.getInstance().get(Calendar.HOUR_OF_DAY) < 12) {
        println("Good morning, Kotlin")
    } else {
        println("Good night, Kotlin")
    }
}

fun getFortuneCookie(): String {
    val fortunes = listOf("You will have a great day!", "Take it easy and enjoy life!",
        "Treasure your friends because they are your greatest fortune.","Enjoy a wonderful day of success.")

    val birthday = getBirthday()

    return when (birthday) {
        28, 31 ->  "You will have a great day!"
        in 1..7 -> "Take it easy and enjoy life!"
        in 8..14 -> "Treasure your friends because they are your greatest fortune."
        else -> "Enjoy a wonderful day of success."
    }

}

fun getBirthday(): Int {
    print("Enter your birthday: ")
    val birthday = readLine()?.toIntOrNull() ?: 1
    return birthday
}

fun canAddFish(
    tankSize: Double,
    currentFish: List<Int>,
    fishSize: Int = 2,
    hasDecorations: Boolean = true
): Boolean {
    val capacity = if (hasDecorations) tankSize * 0.8 else tankSize
    val totalFish = currentFish.sum() + fishSize

    return totalFish <= capacity
}

fun whatShouldIDoToday(
    mood: String,
    weather: String = "Sunny",
    temperature: Int = 24,
) {
    println(
        when {
            homeAndRest(mood, weather) -> "Stay home and rest."
            takeNap(mood) -> "Take a nap"
            goSwimming(temperature) -> "Go swimming"
            getHotChoco(temperature) -> "Get a hot chocolate"
            buildSnowman(weather) -> "Build a snowman"
            comfyInBed(temperature, mood) -> "Get comfy in bed"
            else -> "Go to bed"
        }
    )

}

fun homeAndRest(mood: String, weather: String) = mood == "sad" && weather == "Rainy"
fun takeNap(mood: String) = mood == "tired"
fun goSwimming(temperature: Int) = temperature > 30
fun getHotChoco(temperature: Int) = temperature < 10
fun buildSnowman(weather: String) = weather == "Snowy"
fun comfyInBed(temperature: Int, mood: String) = temperature < 10 && mood == "tired"

val rollDice = { sides: Int ->
    if (sides == 0) 0 else (1..sides).random()
}

val rollDice2: (Int) -> Int = { sides ->
    if (sides == 0) 0 else (1..sides).random()
}

fun gamePlay(diceRoll: Int) {
    println(diceRoll)
}


