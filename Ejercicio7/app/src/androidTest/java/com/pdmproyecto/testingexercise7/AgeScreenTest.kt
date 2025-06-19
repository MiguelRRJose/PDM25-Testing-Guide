package com.pdmproyecto.testingexercise7

import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class AgeScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun ageScreen_displaysAdultWhenOver18() {
        composeTestRule.setContent {
            AgeScreen(age = 21)
        }

        composeTestRule
            .onNodeWithTag("ageText")
            .assertTextEquals("Adult")
    }

    @Test
    fun ageScreen_displaysMinorWhen18OrLess() {
        composeTestRule.setContent {
            AgeScreen(age = 16)
        }

        composeTestRule
            .onNodeWithTag("ageText")
            .assertTextEquals("Minor")
    }
}
