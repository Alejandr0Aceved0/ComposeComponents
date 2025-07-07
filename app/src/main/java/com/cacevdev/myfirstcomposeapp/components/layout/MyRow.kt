package com.cacevdev.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.rememberScrollState
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MyRow(modifier: Modifier = Modifier) {
    Row(modifier = modifier
        .fillMaxWidth()
        .horizontalScroll(rememberScrollState())) {
        Text(text = "Hola1", modifier = Modifier.background(Color.Cyan))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola1", modifier = Modifier.background(Color.Yellow))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola1", modifier = Modifier.background(Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(Color.Cyan))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola1", modifier = Modifier.background(Color.Yellow))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola1", modifier = Modifier.background(Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(Color.Cyan))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola1", modifier = Modifier.background(Color.Yellow))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola1", modifier = Modifier.background(Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(Color.Cyan))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola1", modifier = Modifier.background(Color.Yellow))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola1", modifier = Modifier.background(Color.Blue))
        Text(text = "Hola1", modifier = Modifier.background(Color.Cyan))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola1", modifier = Modifier.background(Color.Yellow))
        Text(text = "Hola1", modifier = Modifier.background(Color.Red))
        Text(text = "Hola1", modifier = Modifier.background(Color.Blue))


    }
}

@Preview
@Composable
fun MyRowPreview() {
    MyRow()
}