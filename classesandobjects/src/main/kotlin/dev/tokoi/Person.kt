package dev.tokoi

import java.lang.Exception

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {

    override fun sign() = println("$name aged $age can sign documents (and their marital status is $isMarried)")

}

class Student(name: String, age: Int) : Person(name, age)

fun main(args: Array<String>) {
    val p = Person("Wesley", 21, true)
    p.sign()

    p.age = 31
    p.sign()
}