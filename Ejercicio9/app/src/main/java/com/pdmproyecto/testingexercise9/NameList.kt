package com.pdmproyecto.testingexercise9

import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun NameList(names: List<String>) {
    Column {
        names.forEach { name ->
            Text(text = name)
        }
    }
}
