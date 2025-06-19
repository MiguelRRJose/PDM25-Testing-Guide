package com.pdmproyecto.testingexercise4

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun ClickButton(modifier: Modifier = Modifier) {
    var clicked by remember { mutableStateOf(false) }

    Button(
        onClick = { clicked = true },
        modifier = modifier.testTag("clickButton")
    ) {
        Text(text = if (clicked) "Clicked" else "Click me")
    }
}
