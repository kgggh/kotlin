import java.awt.Point

fun main() {
    class Point(val x: Int, val y: Int) {
        fun shift(dx: Int, dy: Int) = Point(x + dx, y + dy)
        override fun toString() = "($x $y)"
    }
    val p = Point(10, 10)
    println(p.shift(-1, 3))

    var x = 1
    class Counter {
        fun increment() {
            x++
        }
    }

    Counter().increment()
    println(x)
}

fun foo() {
    println(Point(0, 0))
}