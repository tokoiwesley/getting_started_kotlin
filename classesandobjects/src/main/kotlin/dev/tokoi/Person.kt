package dev.tokoi

interface Signatory {
    fun sign()
}

class Person(val name: String, var age: Int) : Signatory {
    override fun sign() = println("$name aged $age can sign documents")

}

fun main(args: Array<String>) {
    val p = Person("Wesley", 21)
    p.sign()

    p.age = 31
    p.sign()
}