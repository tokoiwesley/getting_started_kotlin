package dev.tokoi

import java.lang.Exception

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int) : Signatory {

    init {
        if (name == "Wesley" && age < 31) throw Exception("Invalid age")
    }

    override fun sign() = println("$name aged $age can sign documents")

}

class Student(name: String, age: Int) : Person(name, age)

fun main(args: Array<String>) {
    val p = Person("Wesley", 21)
    p.sign()

    p.age = 31
    p.sign()
}