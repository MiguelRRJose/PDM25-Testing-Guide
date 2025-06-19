package com.pdmproyecto.testingexercise1

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class NumberUtilsTest {

    private val utils = NumberUtils()

    @Test
    fun testIsEven_withEvenNumber_returnsTrue() {
        val result = utils.isEven(4)
        assertTrue(result)
    }

    @Test
    fun testIsEven_withOddNumber_returnsFalse() {
        val result = utils.isEven(5)
        assertFalse(result)
    }

    @Test
    fun testIsEven_withZero_returnsTrue() {
        val result = utils.isEven(0)
        assertTrue(result)
    }

    @Test
    fun testIsEven_withNegativeEven_returnsTrue() {
        val result = utils.isEven(-2)
        assertTrue(result)
    }

    @Test
    fun testIsEven_withNegativeOdd_returnsFalse() {
        val result = utils.isEven(-3)
        assertFalse(result)
    }
}
