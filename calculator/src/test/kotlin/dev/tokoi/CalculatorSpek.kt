package dev.tokoi

import org.junit.jupiter.api.Assertions
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class CalculatorSpek : Spek({
    val calculator = Calculator(NullResult())

    describe("the calculator") {
        it("should add two numbers") {
            val result = calculator.add(12, 30)

            Assertions.assertEquals(42, result)
        }
    }
})