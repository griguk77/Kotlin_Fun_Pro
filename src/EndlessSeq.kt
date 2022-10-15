fun main() {
    val seq = generateSequence(1) { it + 1 }.map { "Сотрудник №$it" }
    val employees = seq.take(100)
    for (i in employees) {
        println(i)
    }
}