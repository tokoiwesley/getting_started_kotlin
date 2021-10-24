package dev.tokoi.kotlin

import dev.tokoi.java.Person
import java.lang.Exception

class Program {
    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            val p = Person();

            p.name = "Wesley"
            p.age = 31

            println("${p.name} is ${p.age} years old")

            try {
                p.name = ""
            } catch (e: Exception) {
                println(e.message)
            }
        }
    }
}