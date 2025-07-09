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
import androidx.constraintlayout.compose.ChainStyle
import androidx.constraintlayout.compose.ConstraintLayout

@Composable
fun MyConstraintChainExercise(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (boxRed, boxYellow, boxGreen, boxBlue, boxDarkGray, boxMagenta) = createRefs()

        Box(
            Modifier
                .size(100.dp)
                .background(Color.Blue)
                .constrainAs(boxBlue) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(parent.top)
                    bottom.linkTo(boxYellow.top)
                })

        Box(
            Modifier
                .size(100.dp)
                .background(Color.Yellow)
                .constrainAs(boxYellow) {
                    start.linkTo(parent.start)
                    top.linkTo(boxBlue.bottom)
                    bottom.linkTo(boxRed.top)
                    end.linkTo(parent.end)
                })

        Box(
            Modifier
                .size(100.dp)
                .background(Color.Red)
                .constrainAs(boxRed) {
                    start.linkTo(parent.start)
                    end.linkTo(parent.end)
                    top.linkTo(boxYellow.bottom)
                    bottom.linkTo(parent.bottom)
                })

        createVerticalChain(boxYellow, boxRed, boxBlue, chainStyle = ChainStyle.Packed, )

    }
}

@Preview
@Composable
fun PreviewMyConstraintChain(modifier: Modifier = Modifier) {
    MyConstraintChainExercise(modifier)
}