package com.stephanogiuseppe.passkeyvalidation.functions

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import org.springframework.boot.test.context.SpringBootTest

@SpringBootTest
class StringValidationTest {

    @Test
    fun `Should return true if has at least one character`() {
        Assertions.assertEquals(true, oneChar(""))
    }

}
