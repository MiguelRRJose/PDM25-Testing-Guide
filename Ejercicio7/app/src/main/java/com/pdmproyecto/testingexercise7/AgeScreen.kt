package com.pdmproyecto.testingexercise7

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.testTag

@Composable
fun AgeScreen(age: Int, modifier: Modifier = Modifier) {
    if (age > 18) {
        Text("Adult", modifier = modifier.testTag("ageText"))
    } else {
        Text("Minor", modifier = modifier.testTag("ageText"))
    }
}
