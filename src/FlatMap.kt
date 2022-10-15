fun main() {
    val zp = listOf(
        listOf(2, 4, 7, 1),
        listOf(8, 1, 2, 5),
        listOf(23, 543, 32, 1)
    )
    val aver = zp.flatten().average()
    println(aver)

    val data = mapOf<String, List<Int>>(
        "file1" to listOf(32, 13, 53, 89),
        "file2" to listOf(32, -13, 59, 69),
        "file3" to listOf(12, 24, 63, 89),
    )
    val age = data.filter { it.value.all { it >= 0 } }.flatMap { it.value }.average()
    println(age)
}