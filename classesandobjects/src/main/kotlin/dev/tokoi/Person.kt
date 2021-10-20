package dev.tokoi

import java.lang.Exception

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int) : Signatory {

    init {
        if (name == "Wesley" && age < 20) throw Exception("Invalid age")
    }

    var isMarried: Boolean = false;

    constructor(name: String, age: Int, isMarried: Boolean) : this(name, age) {
        this.isMarried = isMarried
    }

    override fun sign() = println("$name aged $age can sign documents (and their marital status is $isMarried)")

}

class Student(name: String, age: Int) : Person(name, age)

fun main(args: Array<String>) {
    val p = Person("Wesley", 21, true)
    p.sign()

    p.age = 31
    p.sign()
}