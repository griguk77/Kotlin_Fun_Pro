fun main() {
    val sum = { a: Int, b: Int -> a + b }
    val square: (Int) -> Int = { it * it }
    println(sum(3, 6))
    println(square(5))

    val perimeter: (Int, Int) -> Int = {a, b -> (a+b)*2}
    println(perimeter(7, 2))

    val hello: (String) -> Unit = { println("Привет, $it!")}
    hello("Григорий")

    val arr: (Array<Int>) -> Array<Int> = {
        for (i in it.indices) {
            for (j in it.size-1 downTo i + 1) {
                if (it[j] > it[j-1]) {
                    val c = it[j]
                    it[j] = it[j-1]
                    it[j-1] = c
                }
            }
        }
        it
    }
    val a: Array<Int> = arr(arrayOf(4, 2, -1, -9, 0, 0, 3, 7, 5, 2))
    for (i in a) {
        println(i)
    }
}