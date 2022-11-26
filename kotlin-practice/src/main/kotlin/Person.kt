class Person {
    var firstName: String = ""
    var familyName: String = ""
    var age: Int = 0

    constructor(firstName: String, familyName: String, age: Int) {
        this.firstName = firstName
        this.familyName = familyName
        this.age = age
    }

    fun fullName() = "$firstName $familyName"

    fun showMe() {
        println("${this.fullName()}: ${this.age}")
    }

    init {
        println( "첫번째 초기화 해볼게요~~~ ${fullName()}")
    }

    init {
        println( "두번쨰 초기화 해볼게요~~~ ${fullName()}")
    }
}

fun main() {
    var person = Person("kim", "geon hee", 10)
    person.fullName()
    person.showMe()
}