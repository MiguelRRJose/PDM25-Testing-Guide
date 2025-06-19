package com.pdmproyecto.testingexercise8

import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun ActivateButton(modifier: Modifier = Modifier) {
    var activated by remember { mutableStateOf(false) }

    Button(
        onClick = { activated = true },
        modifier = modifier.testTag("activateButton")
    ) {
        Text(if (activated) "Activated" else "Activate")
    }
}
