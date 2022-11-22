fun main() {
    println("오버로딩..")
    println(plus("a"))
    println(plus("a", "b"))
    println(plus("a", "b","c"))

    println(" 디폴트 파라미터 ")
//    readInt()
    var num = 5
    println(5 in 5..5)
    println(5 in 5..7)
    println(num in 6.. 7)
}

fun plus(a: String): String {
    return "$a hi"
}
fun plus(a: String, b: String, c: String) = a + b + c
fun plus(a: String, b: String): String {
    return a + b
}

fun readInt(radix: Int = 10) = readLine()!!.toInt(radix)