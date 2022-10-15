fun main() {
    val count = 53
    myWith(count) {
        println(isSimple())
    }
}

fun Int.isSimple(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this % i == 0) return false
    }
    return true
}

fun <T, R> myWith(obj: T, operation: T.() -> R) : R {
    return obj.operation()
}