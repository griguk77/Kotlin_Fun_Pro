fun main() {
    val peoples = mutableListOf<String>()
    for (i in 0..1000) {
        peoples.add("Имя$i Фамилия$i")
    }
    val names = peoples.map { it.substringBefore(" ") }
    val surnames = peoples.map { it.substringAfter(" ") }
    val col = names.zip(surnames)
    for (i in col) {
        println("Имя: ${i.first}, Фамилия: ${i.second}")
    }
}