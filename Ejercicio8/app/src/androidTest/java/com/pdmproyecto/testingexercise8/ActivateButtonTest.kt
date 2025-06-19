package com.pdmproyecto.testingexercise8

import androidx.compose.ui.test.*
import androidx.compose.ui.test.junit4.createComposeRule
import org.junit.Rule
import org.junit.Test

class ActivateButtonTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun activateButton_changesTextAfterClick() {
        // Arrange
        composeTestRule.setContent {
            ActivateButton()
        }

        // Assert initial state
        composeTestRule
            .onNodeWithText("Activate")
            .assertIsDisplayed()

        // Act
        composeTestRule
            .onNodeWithTag("activateButton")
            .performClick()

        // Assert new state
        composeTestRule
            .onNodeWithText("Activated")
            .assertIsDisplayed()
    }
}
