fun main() {
    var ones = 0
    var threes = 0
    val adapters = getResourceAsText("adapters")
    var previousAdapter = 0
    while (adapters.hasNext()) {
        val currentAdapter = adapters.next()
        when (currentAdapter - previousAdapter){
            1 -> ones += 1
            else -> threes += 1
        }
        previousAdapter = currentAdapter
    }
    println("Ones: $ones Threes: ${threes+1}  Multiplied: ${ones.times(threes+1)}")
}

fun getResourceAsText(path: String): ListIterator<Int> {
    return object {}.javaClass
        .getResource(path)
        .readText()
        .split("\n")
        .map { it.toInt() }
        .toMutableList()
        .sorted()
        .listIterator()
}