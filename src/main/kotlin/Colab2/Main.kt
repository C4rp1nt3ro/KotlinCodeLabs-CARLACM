package Colab2
import java.util.*

fun randomDay() : String {
    val week = arrayOf ("Monday", "Tuesday", "Wednesday", "Thursday",
        "Friday", "Saturday", "Sunday")
//    return week[Random().nextInt(week.size)]
//}
//
//fun fishFood (day : String) : String {
//    return when (day) {
//        "Monday" -> "flakes"
//        "Wednesday" -> "redworms"
//        "Thursday" -> "granules"
//        "Friday" -> "mosquitoes"
//        "Sunday" -> "plankton"
//        else -> "nothing"
//    }
//}
//
//fun feedTheFish() {
//    val day = randomDay()
//    val food = fishFood(day)
//    println ("Today is $day and the fish eat $food")
//    println("Change water: ${shouldChangeWater(day)}")
//}
//fun swim(speed: String = "fast") {
//    println("swimming $speed")
//}
//fun shouldChangeWater (day: String, temperature: Int = 22, dirty: Int = 20): Boolean {
//    return when {
//        isTooHot(temperature) -> true
//        isDirty(dirty) -> true
//        isSunday(day) -> true
//        else  -> false
//    }
//}
//fun isTooHot(temperature: Int) = temperature > 30
//fun isDirty(dirty: Int) = dirty > 30
//fun isSunday(day: String) = day == "Sunday"
//fun main(args: Array<String>) {
//    println("Hello, world!")
//    randomDay()
//    feedTheFish()
//    fishFood(day = "Monday")
//    swim()
//    isTooHot(3)
//    isDirty(15)
//    isSunday(day = "Sunday")
//    shouldChangeWater(day = "Sunday")
//    val temperature = 10
//    val message = "The water temperature is ${ if (temperature > 50) "too warm" else "OK" }."
//    println(message)
//}
fun main() {
//    val decorations = listOf ("rock", "pagoda", "plastic plant", "alligator", "flowerpot")
//    val eager = decorations.filter { it [0] == 'p'}
//    val filtered = decorations.asSequence().filter { it[0] == 'p' }
//    val newList = filtered.toList()
    //val lazyMap = decorations.asSequence().map {
//        println("access: $it")
//        it
//    }
//    //val lazyMap2 = decorations.asSequence().filter {it[0] == 'p'}.map {
//        //println("access: $it")
//        it
//    }
    //println("-----")
    //println("filtered: ${lazyMap2.toList()}")
    //println( decorations.filter {it[0] == 'p'})
    //println("eager: $eager")
    //println("filtered: $filtered")
    //println("new list: $newList")
    //println("lazy: $lazyMap")
    //println("-----")
    //println("first: ${lazyMap.first()}")
    //println("-----")
    //println("all: ${lazyMap.toList()}")
//    val mysports = listOf("basketball", "fishing", "running")
//    val myplayers = listOf("LeBron James", "Ernest Hemingway", "Usain Bolt")
//    val mycities = listOf("Los Angeles", "Chicago", "Jamaica")
   val mylist = listOf(mysports, myplayers, mycities)     // list of lists
    println("-----")
    println("Flat: ${mylist.flatten()}")
    var dirtyLevel = 20
    val waterFilter = { dirty : Int -> dirty / 2}
    println(waterFilter(dirtyLevel))
}

