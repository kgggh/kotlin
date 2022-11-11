import kotlin.math.PI

fun main() {
    print("Enter radius: ")
    val radius = readLine()!!.toDouble()
    println("Circle area: ${circleArea(radius)}")
//    println(readInt())
    val a = intArrayOf(1, 2, 3)
    println(increment(a))
    println(a.contentToString())
    prompt1("이름1")
    prompt2("이름4")
}

fun circleArea(radius:Double): Double {
    return PI * radius * radius;
}

fun prompt1(name: String) {
    println("******** Hello, $name! ******")
}

fun prompt2(name: String): Unit {
    println("******** Hello, $name! ******")
}

fun increment(a: IntArray): Int {
    return ++a[0]
}
//fun readInt():Int {
//    return readInt()!!.toInt()
//}