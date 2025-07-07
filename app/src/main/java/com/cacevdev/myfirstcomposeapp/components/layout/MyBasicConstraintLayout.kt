package com.cacevdev.myfirstcomposeapp.components.layout

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyBasicConstraintLayout(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (boxRed, boxGray, boxGreen, boxMagenta, boxYellow) = createRefs()

        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(boxYellow.end)
                })

        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Gray)
                .constrainAs(boxGray) {
                    end.linkTo(boxYellow.start)
                    top.linkTo(boxYellow.bottom)
                })

        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    bottom.linkTo(boxYellow.top)
                    start.linkTo(boxYellow.end)
                })

        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    end.linkTo(boxYellow.start)
                    bottom.linkTo(boxYellow.top)
                })

        Box(
            modifier = Modifier
                .size(150.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                })
    }
}

@Preview
@Composable
fun MyBasicConstraintLayoutPreview() {
    MyBasicConstraintLayout()
}