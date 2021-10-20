package dev.tokoi

import java.lang.Exception

interface Signatory {
    fun sign()
}

open class Person(val name: String, var age: Int, var isMarried: Boolean = false) : Signatory {

    var partnerName: String = ""

    override fun sign() = println("$name aged $age can sign documents (and their marital status is $isMarried)")

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person("Wesley", 21, true)
            p.sign()

            p.age = 31
            p.sign()

            p.partnerName = "Eva"
            println("Partner name is ${p.partnerName}")
        }
    }

}

class Student(name: String, age: Int) : Person(name, age)

data class User(val name: String, val id: Int)

fun main(args: Array<String>) {
    val p = Person("Wesley", 21, true)
    p.sign()

    p.age = 31
    p.sign()

    val wesley = User("Wesley", 1)
    println(wesley)

    val (name, id) = wesley
    println("User is $name and their id is $id")
    val otherUser = wesley.copy(id = 2)
    println(otherUser)
}