package com.pdmproyecto.testingexercise6

class ListUtils {
    fun sumEvenNumbers(list: List<Int>): Int {
        return list.filter { it % 2 == 0 }.sum()
    }
}
