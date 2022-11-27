fun main() {
    val str = "tester"
    val str2 = "teste2345435R#@!#!@#%dd"
    val str3 = null
    println(isLetterString(str))
    println(isLetterString(str2))
//    println(isLetterString(str3)) // null이면 컴파일 에러...
    println(isBooleanString(str3)) // nullable type 통과

    val n: Int = 2
    val m: Int? = 1
    println(n) // 원시 타입의 값
    println(m) // 박싱한 타입의 값을 참조

    println(exclaim(str))
    println(exclaim(null))
    println(isLetterString2(str))
}

fun isLetterString(s: String): Boolean {
    if ( s.isEmpty() ) return false
    for (ch in s) if( !ch.isLetter()) return false
    return true
}

fun isBooleanString(s: String?) = s == "false" || s == "true"

fun exclaim(s: String?) {
    println("$s!")
}


fun isLetterString2(s: String?): Boolean {
    if ( s == null) return false
    if( s.isEmpty() ) return false

    // Smart cast to kotlin.String
    for (ch in s) if( !ch.isLetter()) return false
    return true
}