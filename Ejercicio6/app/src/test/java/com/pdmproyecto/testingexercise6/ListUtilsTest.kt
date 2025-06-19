package com.pdmproyecto.testingexercise6

import org.junit.Assert.assertEquals
import org.junit.Test

class ListUtilsTest {

    private val utils = ListUtils()

    @Test
    fun sumEvenNumbers_withMixedList_returnsSumOfEvens() {
        val result = utils.sumEvenNumbers(listOf(1, 2, 3, 4, 5, 6))
        assertEquals(12, result) // 2 + 4 + 6
    }

    @Test
    fun sumEvenNumbers_withOnlyOdds_returnsZero() {
        val result = utils.sumEvenNumbers(listOf(1, 3, 5, 7))
        assertEquals(0, result)
    }

    @Test
    fun sumEvenNumbers_withEmptyList_returnsZero() {
        val result = utils.sumEvenNumbers(emptyList())
        assertEquals(0, result)
    }
}
