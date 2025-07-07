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
fun MyBasicConstraintLayoutExercise(modifier: Modifier = Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (boxCyan, boxBlack, boxDarkGrey, boxRed, boxGray, boxGreen, boxMagenta, boxYellow, boxBlue) = createRefs()


        Box(
            modifier = Modifier
                .size(170.dp)
                .background(Color.Cyan)
                .constrainAs(boxCyan) {
                    bottom.linkTo(boxMagenta.top)
                    end.linkTo(boxMagenta.end)
                }
        )

        Box(
            modifier = Modifier
                .size(75.dp)
                .background(Color.Black)
                .constrainAs(boxBlack) {
                    top.linkTo(boxCyan.top)
                    bottom.linkTo(boxCyan.bottom)
                    start.linkTo(boxCyan.end)
                }
        )

        Box(
            modifier = Modifier
                .size(170.dp)
                .background(Color.DarkGray)
                .constrainAs(boxDarkGrey) {
                    bottom.linkTo(boxGreen.top)
                    start.linkTo(boxBlack.end)
                }
        )

        Box(
            modifier = Modifier
                .size(75.dp)
                .background(Color.Magenta)
                .constrainAs(boxMagenta) {
                    end.linkTo(boxYellow.start)
                    bottom.linkTo(boxYellow.top)
                }
        )

        Box(
            modifier = Modifier
                .size(75.dp)
                .background(Color.Green)
                .constrainAs(boxGreen) {
                    bottom.linkTo(boxYellow.top)
                    start.linkTo(boxYellow.end)
                }
        )

        Box(
            modifier = Modifier
                .size(75.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    bottom.linkTo(parent.bottom)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    start.linkTo(parent.start)
                }
        )

        Box(
            modifier = Modifier
                .size(170.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    top.linkTo(boxYellow.bottom)
                    end.linkTo(parent.end)
                    start.linkTo(parent.start)
                }
        )

        Box(
            modifier = Modifier
                .size(75.dp)
                .background(Color.Gray)
                .constrainAs(boxGray) {
                    end.linkTo(boxYellow.start)
                    top.linkTo(boxYellow.bottom)
                }
        )

        Box(
            modifier = Modifier
                .size(75.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    top.linkTo(boxYellow.bottom)
                    start.linkTo(boxYellow.end)
                }
        )
    }
}

@Preview
@Composable
fun PreviewMyBasicConstraintLayoutExercise() {
    MyBasicConstraintLayoutExercise()
}