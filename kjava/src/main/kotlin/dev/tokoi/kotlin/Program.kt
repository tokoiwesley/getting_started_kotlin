package dev.tokoi.kotlin

import dev.tokoi.java.Person

class Program {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person();

            p.name = "Wesley"
            p.age = 31

            println("${p.name} is ${p.age} years old")
        }
    }
}