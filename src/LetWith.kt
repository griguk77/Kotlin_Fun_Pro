val list: MutableList<Int>? = mutableListOf<Int>()

fun main() {

    with(list) {
        this?.let {
            for (i in 0 until 1000) {
                add((Math.random() * 100).toInt())
            }
            val evenList = filter { it % 2 == 0 }.take(100)
            for (i in evenList) {
                println(i)
            }
            println("Сумма: ${sum()}")
            println("Среднее: ${average()}")
            println("Максимальное: ${maxOrNull()}")
            println("Минимальное: ${minOrNull()}")
            println("Первое: ${first()}")
            println("Последнее: ${last()}")
        }
    }

}