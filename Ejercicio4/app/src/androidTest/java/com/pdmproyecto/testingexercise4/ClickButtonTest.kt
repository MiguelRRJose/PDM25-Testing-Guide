package com.pdmproyecto.testingexercise4

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.*
import org.junit.Rule
import org.junit.Test

class ClickButtonTest {

    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun clickButton_changesText() {
        // Arrange
        composeTestRule.setContent {
            ClickButton()
        }

        // Act
        composeTestRule
            .onNodeWithTag("clickButton")
            .performClick()

        // Assert
        composeTestRule
            .onNodeWithText("Clicked")
            .assertExists()
    }
}
