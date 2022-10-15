fun main() {
    val names: MutableList<String> = mutableListOf()
    names.add("Анастасия")
    names.add("Григорий")
    names.add("Екатерина")
    names.add("Андрей")
    names.add("Евгений")
    names.add("Роман")
    names.add("Николай")
    names.add("Антон")
    names.add("Алекснадр")
    names.add("Кирилл")
    val aNames: List<String> = names.filter { it.startsWith("А") }
    for (i in aNames) {
        println(i)
    }

    val counts: MutableList<Int> = mutableListOf()
    for (i in 0..999) {
        counts.add((Math.random() * 1000).toInt())
    }
    val newCounts = (((counts.filter { it % 3 == 0 || it % 5 == 0 }).map { it * it }).sortedDescending()).map { "$it" }
    for (i in newCounts) {
        println(i)
    }
}