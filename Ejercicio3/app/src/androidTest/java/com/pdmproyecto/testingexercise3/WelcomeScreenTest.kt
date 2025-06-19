package com.pdmproyecto.testingexercise3

import androidx.compose.ui.test.assertIsDisplayed
import androidx.compose.ui.test.assertTextEquals
import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithTag
import org.junit.Rule
import org.junit.Test

class WelcomeScreenTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun welcomeScreen_displaysCorrectMessage() {
        // Arrange
        composeTestRule.setContent {
            WelcomeScreen(name = "John")
        }

        // Assert
        composeTestRule
            .onNodeWithTag("welcomeText")
            .assertIsDisplayed()
            .assertTextEquals("Welcome, John")
    }
}
