package com.pdmproyecto.testingexercise9

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import org.junit.Rule
import org.junit.Test

class NameListTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun nameList_displaysAllNames() {
        val names = listOf("Ana", "Luis", "Sofía")

        composeTestRule.setContent {
            NameList(names)
        }

        names.forEach { name ->
            composeTestRule
                .onNodeWithText(name)
                .assertIsDisplayed()
        }
    }
}
