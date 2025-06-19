package com.pdmproyecto.testingexercise5

import org.junit.Assert.*
import org.junit.Test

class ValidatorTest {

    private val validator = Validator()

    @Test
    fun validEmail_returnsTrue() {
        val result = validator.isValidEmail("user@example.com")
        assertTrue(result)
    }

    @Test
    fun missingAtSymbol_returnsFalse() {
        val result = validator.isValidEmail("userexample.com")
        assertFalse(result)
    }

    @Test
    fun emptyEmail_returnsFalse() {
        val result = validator.isValidEmail("")
        assertFalse(result)
    }
}
