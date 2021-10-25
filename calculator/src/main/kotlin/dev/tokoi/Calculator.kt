package dev.tokoi

class Calculator(output: Result) {
    fun add(x: Int, y: Int): Int {
        return x + y;
    }
}

interface Result {
    fun write(answer: Int)
}

class NullResult : Result {
    override fun write(answer: Int) {

    }
}