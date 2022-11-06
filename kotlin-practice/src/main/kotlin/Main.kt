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
}