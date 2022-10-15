fun main() {
    val counts = listOf(3, 1, 2, 6, 8, -3, 0, 4)
    println(sumCol(counts) { it.sum() })
}

inline fun sumCol (counts: List<Int>, sum: (List<Int>) -> Int): Int {
    return sum(counts)
}