import java.util.*

fun main() {
    println("Hello, KotlinVerse!!");
    /*/* 주석 ~~~~ */*/
    //주석
    /** doc 주석 ~!*/

//    val a = readLine()!!.toInt() // !! <- not-null
//    val b = readLine()!!.toInt() // !! <- not-null
//    println(a+b)


    /*
    val: 불변 변수
    var: 가변 변수
    */
    /* 타입 추론 가능함*/
    val text = "이거 String임 추론 가능?"
    println(text)
    val num =  1234
    println(num)
    println("=========================")

    val n:Int = 1234 // 타입 명시시 변수명:Type
    val c:Char = 'a'
    println(n)
    println(c)
    println("=========================")

    val `fun` = 1
    val `name with spaces` = 2

    println(`fun`)
    println(`name with spaces`)
    println("=========================")

    var sum:Int = 0
    sum += 2
    sum += 3
    println(sum)
    println("=========================")

    var a = 1
    println(a++)
    println(++a)
    println(--a)
    println(a--)

    println(Float.MAX_VALUE)
    println(Float.MIN_VALUE)
    println(Double.NEGATIVE_INFINITY)
    println(Double.POSITIVE_INFINITY)
    println("==========================")

    equals()
    stringExpression()
    arrayIndex()
    arrays()
}

private fun equals() {
    val txt = "TEST"
    var txt2 = "test"

    println(txt == txt2.uppercase())
    println(txt === txt2.uppercase())
    println(txt == txt2)
}

private fun stringExpression() {
    val name = "John"
    println("Hello my name is $name , Today is ${Date()}") // String Template 표현식

    val message = """
        Hello Text $name ${Date()}""".trimIndent() // raw string
    println(message)
}

private fun arrayIndex() {
    val text = "안녕"
    println(text[0].equals("안"))
    println(text[1])
    for (c in text) { //자바와 다르게 looping 연산 가능
        println(c)
    }
}

private fun arrays() {
    val a = emptyArray<String>()
    var b = arrayOf(1,2)
    var c = arrayOf("안","녕")

    for (i in b) {
        println(i)
    }

    for (i in c) {
        println(i)
    }
}


