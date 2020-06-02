class Operator {

    private val someList = listOf("Apple", "Pear", "Strawberry", "Plum", "Pear")

    fun doSomeWithString() {
        println("########### 1")
        someList.forEach { println("$it - ${it.length} letters") }
        println("########### 2")
        val reservedList = someList.asReversed()
        reservedList.forEach { println(it.reversed()) }
        println("########### 3")
        val test = someList.joinToString(
                separator = ""
        ).toLowerCase().toCharArray()
        println(test.distinct().joinToString(separator = ""))
    }

    private val intList = mutableListOf(5, 720, 16, 721, 94, 24, 720, 27, 72, 77, 35, 16, 85, 718, 5)

    fun doSomeWithNumbers() {
        println("########### 1")
        println(intList.sum())
        println("########### 2")
        println(intList)

    }
}

fun main() {
    Operator().doSomeWithNumbers()
}
