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
fun MyConstraintBarrierExercise(modifier: Modifier) {
    ConstraintLayout(modifier = modifier.fillMaxSize()) {

        val (boxRed, boxYellow, boxGreen, boxBlue, boxDarkGray, boxMagenta) = createRefs()

        val barrierEnd = createEndBarrier(boxRed, boxYellow)
        val barrierStart = createStartBarrier(boxRed, boxYellow)
        val barrierTop = createTopBarrier(boxRed, boxYellow)
        val barrierBottom = createBottomBarrier(boxRed, boxYellow)


        Box(Modifier
            .size(200.dp)
            .background(Color.Yellow)
            .constrainAs(boxYellow) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(parent.bottom)
            })

        Box(Modifier
            .size(65.dp)
            .background(Color.Red)
            .constrainAs(boxRed) {
                top.linkTo(parent.top)
                start.linkTo(parent.start)
                end.linkTo(parent.end)
                bottom.linkTo(boxYellow.top)
            })



        Box(Modifier
            .size(65.dp)
            .background(Color.Green)
            .constrainAs(boxGreen) {
                bottom.linkTo(barrierTop)
                end.linkTo(barrierStart)
            })

        Box(Modifier
            .size(65.dp)
            .background(Color.DarkGray)
            .constrainAs(boxDarkGray) {
                start.linkTo(barrierEnd)
                top.linkTo(barrierBottom)
            })

        Box(Modifier
            .size(65.dp)
            .background(Color.Blue)
            .constrainAs(boxBlue) {
                start.linkTo(barrierEnd)
                bottom.linkTo(barrierTop)
            })

        Box(Modifier
            .size(65.dp)
            .background(Color.Magenta)
            .constrainAs(boxMagenta) {
                top.linkTo(barrierBottom)
                end.linkTo(barrierStart)
            })
    }
}

@Preview
@Composable
fun PreviewMyConstraintBarrier(modifier: Modifier = Modifier) {
    MyConstraintBarrierExercise(modifier)
}