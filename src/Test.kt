fun main() {
    val data = mapOf<String, List<Int>>(
        "Январь" to listOf(199, 45, 457, 93),
        "Февраль" to listOf(19, -45, 305, 193),
        "Март" to listOf(-104, 45, 25, 84),
        "Апрель" to listOf(69, 243, 65, 93),
        "Май" to listOf(164, 5, 425, 200),
        "Июнь" to listOf(299, 30, 305, -183),
    )
    printInfo(data)
}

fun printInfo(data: Map<String, List<Int>>) {
    val dataNotNull = data.filter { it.value.all { it >= 0 } }
    val aver = dataNotNull.flatMap { it.value }.average()
    val sums = dataNotNull.map { it.value.sum() }
    val max = sums.maxOrNull()
    val min = sums.minOrNull()
    val monMax = dataNotNull.filter { it.value.sum() == max }.keys
    val monMin = dataNotNull.filter { it.value.sum() == min }.keys
    val monNull = data.filter { it.value.any { it < 0 } }.keys

    println("Средняя выручка в неделю: $aver")
    println("Средняя выручка в месяц: ${sums.average()}")
    println("Максимальная выручка в месяц: $max")
    println("Была в следующих месяцах:")
    for (i in monMax) {
        print("$i ")
    }
    println("\nМинимальная выручка в месяц: $min")
    println("Была в следующих месяцах:")
    for (i in monMin) {
        print("$i ")
    }
    println("\nОшибки произошли в следующих месяцах:")
    for (i in monNull) {
        print("$i ")
    }
    println()
}