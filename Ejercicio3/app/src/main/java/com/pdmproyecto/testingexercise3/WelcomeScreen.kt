package com.pdmproyecto.testingexercise3

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun WelcomeScreen(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Welcome, $name",
        modifier = modifier.testTag("welcomeText")
    )
}
